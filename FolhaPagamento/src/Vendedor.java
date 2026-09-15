public class Vendedor extends Funcionario{
    private double totalVendido;


         public Vendedor(String nome, String cpf, double salario, double totalVendido) {
            super(nome, cpf, salario);
            this.totalVendido = totalVendido;
    }


    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.05;
    }

    public double calcularComicao() {
        return this.totalVendido * 0.05 ;

    }
    @Override
    public double cacularRemuneracao() {
        return getSalario() + calcularBonificacao() + calcularComicao();
    }

    @Override
    public String getExibir(){
        return super.getExibir() + "Vendas: R$ " + totalVendido;
    }
}
