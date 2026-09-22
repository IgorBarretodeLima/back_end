import static java.lang.IO.*;

public class Main{
    static void main(){
     Caixa cx = new Caixa();

    FormaPagamento pix = new PagamentoPix("Ana Silva", "1234");
    FormaPagamento cr = new PagamentoCartao("Carlos roberto", "123456789");

    cx.finalizarCompra(pix, 120.00);
    cx.finalizarCompra(cr, 350.00);
    }
}