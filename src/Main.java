import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Quantos impostos a pagar: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Taxa paga #" + i + ":");
            System.out.print("Física ou Jurídica (f/j): ");
            char ch = sc.next().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Renda Anual: ");
            double renda = sc.nextDouble();

            if (ch == 'f') {
                System.out.print("Gastos com Saúde: ");
                double saude = sc.nextDouble();


                if (renda < 20000) {
                    double imposto = 0.15;
                    Pessoa pessoa = new PessoaFisica(name, renda, saude, imposto);
                    list.add(pessoa);
                } else if (renda >= 20000) {
                    double imposto = 0.25;
                    Pessoa pessoa = new PessoaFisica(name, renda, saude, imposto);
                    list.add(pessoa);
                }


            } else if (ch == 'j') {

                System.out.print("Quantidade funcionários: ");
                int funcionarios = sc.nextInt();


                if (funcionarios > 10) {
                    double imposto = 0.14;
                    Pessoa pessoa = new PessoaJuridica(name, renda, funcionarios, imposto);
                    list.add(pessoa);
                } else if (funcionarios < 10) {
                    double imposto = 0.16;
                    Pessoa pessoa = new PessoaJuridica(name, renda, funcionarios, imposto);
                    list.add(pessoa);
                }

            }
        }



            System.out.println();
            System.out.println("Taxas Pagas");
                for (Pessoa pessoa : list) {
                    System.out.println(pessoa);
            }


    }
}