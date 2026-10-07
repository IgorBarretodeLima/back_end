import static java.lang.IO.*;
class Pessoas {
    int id;
    String nome;
    int idade;

    public Pessoas(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{id=" + id + ", nome='" + nome + "', idade=" + idade + "}";
    }
}