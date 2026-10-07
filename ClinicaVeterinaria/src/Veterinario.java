import static java.lang.IO.*;
public class Veterinario extends Funcionario {
    private int tratados;

    public Veterinario(String nome, String cpf, double salario, int tratados) {
        super(nome, cpf, salario);
        this.tratados = tratados;
    }

    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.15;
    }

    public double calcularComissao() {
        return tratados * 67;
    }

    @Override
    public double calcularRemuneracao() {
        return getSalario() + calcularBonificacao() + calcularComissao();
    }

    @Override
    public void exibirHolerite() {
        super.exibirHolerite();
        println("Animais tratados: " + tratados);
        println("Comissão: R$ " + String.format("%.2f", calcularComissao()));
        println("Remuneração final: R$ " + String.format("%.2f", calcularRemuneracao()));
        println("------------------------------");
    }
}