public class ContaEmpresarial extends ContaBancaria {

    private double limiteCredito;
    private double TAXA_SAQUE = 5.00;

    public ContaEmpresarial(String numero, String titular, double limiteCredito) {
        super(numero, titular);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double getTaxaSaque() {
        return TAXA_SAQUE;
    }

    @Override
    public boolean sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Saque inválido. O valor deve ser maior que zero.");
            return false;
        }

        // Valor total retirado da conta:
        // saque + taxa
        double valorTotal = valor + TAXA_SAQUE;

        if (valorTotal > getSaldo() + limiteCredito) {
            System.out.println("Saque recusado. Saldo + limite insuficiente.");
            return false;
        }

        debitar(valorTotal);

        System.out.print("Saque de R$" + valor + " realizado com sucesso." + valor);
        System.out.print("Taxa de saque: R$" + TAXA_SAQUE);

        return true;
    }

    @Override
    public void exibirResumo() {
        super.exibirResumo();
        System.out.print("Limite de crédito: R$ " + limiteCredito);
        System.out.print("Taxa por saque: R$" + TAXA_SAQUE);
        System.out.print("Limite disponível: R$" +
                (limiteCredito + getSaldo()));
        System.out.println("-----------------------------------");
    }
}