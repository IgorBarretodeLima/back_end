import java.time.LocalDate;

public class Livro {

    public String nome;
    public String autor;
    public String editor;
    public float preco;

    public Livro(String nome, String autor, String editor, float preco) {
        this.nome = nome;
        this.autor = autor;
        this.editor = editor;
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", autor'" + autor + '\'' +
                ", editora='" + editor + '\'' +
                ", preço "+ preco + '\'' +
                '}';
    }
    public String abrir() {
        return "logado com sucesso";
    }

    public String ler() {
        return "você se-deslogou";
    }


    public String fechar() {
        return "A senha foi recuperada";
    }
}


