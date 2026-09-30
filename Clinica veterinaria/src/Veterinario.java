public class Veterinario extends Funcionario {
    private double tratados;


    public Veterinario(String nome, String cpf, double salario, double tratados) {
        super(nome, cpf, salario);
        this.tratados = tratados;
    }

    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.15;
    }

    public double calcularComissao(){
        return tratados * 67;

    }
    @Override
    public double cacularRemuneracao() {
        return getSalario() + calcularBonificacao() + calcularComissao();
    }

    @Override
    public String getExibir() {
        return super.getExibir() + "Numero de animais tratados" + tratados;
    }
}
