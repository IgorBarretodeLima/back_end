import static java.lang.IO.*;
void main() {
    ContaBancaria c4=new ContaBancaria();
    c4.setTitular("casio");
    c4.depositar(500);
    c4.sacar(500);
    c4.getSaldo();
}