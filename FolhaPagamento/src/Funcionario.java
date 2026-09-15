public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario){
        if(nome.isEmpty()) {
            throw new IllegalArgumentException("nome é obrigatorio");
        }
        this.nome = nome;
        if (cpf.isEmpty()) {
            throw new IllegalArgumentException("CPF é obrigatorio");
        }
        this.cpf = cpf;

        if(salario<1.620){
            throw new IllegalArgumentException("O salario tem que ser maior que o salario minimo");
        }
        this.salario = salario;

    }

    public String getExibir() {
        return "Tipo de Funcionario"  +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario
                ;
    }
    public double getSalario(){
        return salario;
    }

    public  abstract  double calcularBonificacao();

    public double cacularRemuneracao(){
        return salario + calcularBonificacao();
    }

    public  void exibirHolerite(){
        IO.println("Funcionario: " + nome);
    IO.println("Cargo: " + getClass().getSimpleName());
        IO.println("Salario: " + salario);
        IO.println("Remuneração: " + cacularRemuneracao());
    }
}
