import static java.lang.IO.*;
public class ContaBancaria {
    private String titular;
    private double saldo = 0.00;
    private double limite;


    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double dinheiro){
        if (dinheiro < 0){
            println("ERRO, esse valor é invalido");
        }
        else {
            println("O dinheiro foi depositado na conta");
            this.saldo= saldo + dinheiro;
        }
    }

    public void sacar(double dinheiro){
        if (dinheiro>saldo && dinheiro>limite){
            println("ERRO, esse valor invalido é invalido ");
        }

        else if (dinheiro < limite && dinheiro > saldo){
            this.limite = limite - dinheiro;
        }

        else {
            this.saldo=saldo-dinheiro;
            println("seu valor foi sacado, vai gastar");
        }
    }

    public void mostrar(){
        println("seu saldo: R$" + saldo );
    }
}