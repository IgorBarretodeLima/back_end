public abstract class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {

        if (valor <= 0) {
            System.out.println("Depósito inválido. O valor deve ser maior que zero.");
            return;
        }

        saldo += valor;

        System.out.print("Depósito de R$ " + valor + " realizado com sucesso" + valor);
    }

    protected boolean debitar(double valor) {

        if (valor <= 0) {
            return false;
        }

        saldo -= valor;
        return true;
    }

    public abstract boolean sacar(double valor);

    public void exibirResumo() {

        System.out.println("-----------------------------------");
        System.out.println("Número da conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.print("Saldo: R$ " + saldo);
        System.out.println("-----------------------------------");
    }
}