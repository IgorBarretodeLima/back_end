public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);

    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    @Override
    public double calcularBonificacao(){
        return getSalario() * 0.20;
    }
    public double cacularRemuneracao(){
        return getSalario() + calcularBonificacao();

    }

}
