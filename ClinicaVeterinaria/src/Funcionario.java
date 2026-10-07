import static java.lang.IO.*;
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double calcularBonificacao();

    public double calcularRemuneracao() {
        return salario + calcularBonificacao();
    }

    public void exibirHolerite() {
        println("Funcionário: " + nome);
        println("Cargo: " + getClass().getSimpleName());
        println("Salário: R$ " + String.format("%.2f", salario));
        println("Bonificação: R$ " + String.format("%.2f", calcularBonificacao()));
        println("Remuneração: R$ " + String.format("%.2f", calcularRemuneracao()));
        println("------------------------------");
    }
}