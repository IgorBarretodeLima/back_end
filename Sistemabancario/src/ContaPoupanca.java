public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String numero, String titular) {
        super(numero, titular);
    }

    @Override
    public boolean sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Saque inválido. O valor deve ser maior que zero.");
            return false;
        }

        if (valor > getSaldo()) {
            System.out.println("Saque recusado. Saldo insuficiente.");
            return false;
        }

        debitar(valor);

        System.out.print("Saque de R$" + valor + " realizado com sucesso." + valor);
        return true;
    }
}