public class PagamentoCartao extends FormaPagamento {

    private String num_cartao;

    public PagamentoCartao (String titular, String num_cartao){
        super(titular);
        this.num_cartao = num_cartao;

    }

    public String getNum_cartao(){
        return num_cartao;
    }
    @Override
    public void processarPagamento(double valor) {
        String finalCartao = num_cartao.substring(num_cartao.length() - 4);
        System.out.printf("[Cartão] Processando o valor de R$ %,2f para o %s, Ultimos digitos do cartão é %s", valor, getTitular(), num_cartao);
    }
}
