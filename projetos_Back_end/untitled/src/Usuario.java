import java.time.LocalDate;

public class Usuario {
    public String nome;
    public String senha;
    public LocalDate dtNasc;
    public String email;

    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    // Construtor corrigido com chaves {}


    public String logar() {
        return "logado com sucesso";
    }

    public String deslogar() {
        return "você se-deslogou";
    }


    public String recuperar_senha() {
        return "A senha foi recuperada";
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
