public class PagamentoPix extends FormaPagamento{

   private String chavePix;

   public PagamentoPix (String titular, String chavePix){
       super(titular);
       this.chavePix = chavePix;
   }

   public String getChavePix(){
       return chavePix;
   }
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("[pix] Processado R$ %.2f para %s (chave: %s", valor, getTitular(), chavePix);
    }
}
