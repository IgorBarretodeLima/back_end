public class Caminhao {


    public String nome;
    public String motor;
    public String tipo_de_carta;

    public Caminhao(String nome, String motor, String tipo_de_carta) {
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


    public String desligar() {
        return "desligado com sucesso";
    }
    public String acarretar() {
        return "A carreta foi acoplada";
    }

    @Override
    public String toString() {
        return "Moto{" +
                "nome='" + nome + '\'' +
                ", motor='" + motor + '\'' +
                ", tipo_de_carta='" + tipo_de_carta + '\'' +
                '}';
    }
}