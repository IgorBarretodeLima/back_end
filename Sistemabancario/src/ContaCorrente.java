public class ContaCorrente extends ContaBancaria {

    private double limite;

    public ContaCorrente(String numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public boolean sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Saque inválido. O valor deve ser maior que zero.");
            return false;
        }

        // O saque pode usar o limite
        if (valor > getSaldo() + limite) {
            System.out.println("Saque recusado. Saldo + limite insuficiente.");
            return false;
        }

        debitar(valor);

        System.out.print("Saque de R$ " + valor + " realizado com sucesso.%n" + valor);
        return true;
    }

    @Override
    public void exibirResumo() {
        super.exibirResumo();
        System.out.print("Limite: R$ " + limite);
        System.out.print("Limite disponível: R$ " +
                (limite + getSaldo()));
        System.out.println("-----------------------------------");
    }
}