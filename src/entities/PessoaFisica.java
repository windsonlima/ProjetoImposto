package entities;

public class PessoaFisica extends Pessoa{

        private double saude;
        private double imposto;

        public PessoaFisica() {

        }

    public PessoaFisica(String name, double renda, double saude, double imposto) {
        super(name, renda);
        this.saude = saude;
        this.imposto = imposto;
    }

    public double getSaude() {

            return saude * 0.50;
    }

    public void setSaude(double saude) {

            this.saude = saude;
    }

    public double getImposto() {

            return imposto *= getRenda();
    }

    public void setImposto(double imposto) {

            this.imposto = imposto;
    }

    public double impostoTotal() {
            return getImposto() - getSaude();
    }


    @Override
    public String toString() {
        return "Nome: " + getName() +
                ", " +
                String.format("Imposto: $ %.2f", impostoTotal());
    }
}
