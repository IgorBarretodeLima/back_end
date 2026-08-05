public class Carro {


    public String nome;
    public String motor;
    public String tipo_de_carta;

    public Carro(String nome, String motor, String tipo_de_carta) {
        this.nome = nome;
        this.motor = motor;
        this.tipo_de_carta = tipo_de_carta;
    }



    public String ligar() {
        return "ligado com sucesso ";
    }

    public String acelerar() {
        return "Acelerando";
    }

    public String freiar() {
        return "você bateu";
    }


    public String sair() {
        return "desligado com sucesso";
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", motor='" + motor + '\'' +
                ", tipo_de_carta='" + tipo_de_carta + '\'' +
                '}';
    }
}