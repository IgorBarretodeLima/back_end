import static java.lang.IO.*;
public class Vendedor extends Funcionario {
    private double totalVendido;

    public Vendedor(String nome, String cpf, double salario, double totalVendido) {
        super(nome, cpf, salario);
        this.totalVendido = totalVendido;
    }

    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.05;
    }

    public double calcularComissao() {
        return totalVendido * 0.05;
    }

    @Override
    public double calcularRemuneracao() {
        return getSalario() + calcularBonificacao() + calcularComissao();
    }

    @Override
    public void exibirHolerite() {
        super.exibirHolerite();
        println("Total vendido: R$ " + String.format("%.2f", totalVendido));
        println("Comissão: R$ " + String.format("%.2f", calcularComissao()));
        println("Remuneração final: R$ " + String.format("%.2f", calcularRemuneracao()));
        println("------------------------------");
    }
}