public abstract class FormaPagamento {

    private String titular;

    public FormaPagamento(String titular){
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public abstract void processarPagamento(double valor);
}
