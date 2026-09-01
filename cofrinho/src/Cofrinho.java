
public class Cofrinho {
    private String nome;
    private double saldo;
    private double meta;

    public Cofrinho(String nome, double meta) {
        this.nome = nome;
        this.meta = meta;
        this.saldo = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getMeta() {
        return meta;
    }

    public void adicionarDinheiro(double valor) {
        if (valor <= 0) {
            System.out.println("O valor para depósito deve ser maior que zero!");
            return;
        }
        this.saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void retirarDinheiro(double valor) {
        if (valor <= 0) {
            System.out.println("O valor para saque deve ser positivo!");
            return;
        }
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para realizar o saque de R$ " + valor);
            return;
        }
        this.saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
    }

    public double getProgresso() {
        if (this.meta <= 0) return 0.0;
        return (this.saldo / this.meta) * 100;
    }

    public String getStatus() {
        if (this.saldo == 0) {
            return "Meta não iniciada";
        } else if (this.saldo < this.meta) {
            return "Economizando";
        } else {
            return "Meta alcançada";
        }
    }
}
