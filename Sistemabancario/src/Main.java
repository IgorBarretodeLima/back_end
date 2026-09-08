public class Main {

    public static void main(String[] args) {


        System.out.println("SISTEMA BANCÁRIO");



        ContaPoupanca poupanca = new ContaPoupanca("0001-1", "João Silva");

        ContaCorrente corrente = new ContaCorrente("0001-2", "Maria Souza", 1000.00);

        ContaEmpresarial empresarial = new ContaEmpresarial("0001-9", "Loja Central Ltda.", 5000.00);


        System.out.println("\n--- SALDOS INICIAIS ---");

        poupanca.exibirResumo();
        corrente.exibirResumo();
        empresarial.exibirResumo();


        System.out.println("\n DEPÓSITO MAIOR QUE ZERO ");

        poupanca.depositar(1000.00);


        System.out.println("\n DEPÓSITO IGUAL A ZERO ");

        poupanca.depositar(0);


        System.out.println("\n DEPÓSITO NEGATIVO ");

        poupanca.depositar(-100);



        System.out.println("\n SAQUE COM SALDO SUFICIENTE");

        poupanca.sacar(300);



        System.out.println("\n SAQUE COM SALDO INSUFICIENTE ");

        poupanca.sacar(1000);


        System.out.println("\n SAQUE UTILIZANDO O LIMITE ");

        corrente.depositar(500);

        corrente.sacar(1200);



        System.out.println("\n SAQUE ACIMA DO LIMITE ");

        corrente.sacar(500);


        System.out.println("\n SAQUE ACIMA DO SALDO + LIMITE ");

        corrente.sacar(1000);



        System.out.println("\n CONTA EMPRESARIAL ");

        empresarial.depositar(2000);


        empresarial.sacar(2500);



        System.out.println("\nSAQUE NEGATIVO ");

        empresarial.sacar(-100);



        System.out.println("\nCONTA POUPANÇA:");
        poupanca.exibirResumo();

        System.out.println("\nCONTA CORRENTE:");
        corrente.exibirResumo();

        System.out.println("\nCONTA EMPRESARIAL:");
        empresarial.exibirResumo();
    }
}