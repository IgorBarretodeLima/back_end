public class Caixa {
    public  void  finalizarCompra(FormaPagamento pagamento, double valor){
        System.out.println("Iniciando a transação ...");
        pagamento.processarPagamento(valor);
        System.out.println("\nTransação efetuada\n");
    }
}
