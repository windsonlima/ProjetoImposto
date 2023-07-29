package entities;

public class PessoaJuridica extends Pessoa{

    private int funcionarios;
    private double imposto;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String name, double renda, int funcionarios, double imposto) {
        super(name, renda);
        this.funcionarios = funcionarios;
        this.imposto = imposto;
    }

    public int getFuncionarios() {

        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {

        this.funcionarios = funcionarios;
    }

    public double getImposto() {
        return imposto * getRenda();
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return "Nome: " + getName() +
                ", " +
                String.format("Imposto: $ %.2f", getImposto());
    }
}
