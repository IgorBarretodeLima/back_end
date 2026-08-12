import static java.lang.IO.*;

void main() {
    ContaBancaria c4=new ContaBancaria();

    String tiular = readln("digite o nome do titular");
    double limiti = Double.parseDouble("digite o seu limite");


    boolean executando = true;

    println("Conta bancaria ONLINE\n");

    while (executando) {
        String opcao = readln("\n1-Saque | 2-Depósito | 3-Saldo e limite | 0-Sair\nOpção: ");

        switch (opcao) {
            case "1":
                double saque = Double.parseDouble(readln("Valor para o saque: "));
                c4.sacar(saque);
                break;

            case "2":
                double deposito = Double.parseDouble(readln("Valor para o depósito: "));
                c4.depositar(deposito);
                break;

            case "3":
                c4.mostrar();
                break;

            case "0":
                println("Encerrando...");
                executando = false;
                break;

            default:
                println("Opção inválida!");
        }
    }
}