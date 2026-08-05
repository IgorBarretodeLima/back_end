public class Bicicleta {


    public String nome;
    public String aro;
    public String material;

    public Bicicleta(String nome, String aro, String material) {
        this.nome = nome;
        this.aro = aro;
        this.material = material;
    }



    public String montar() {
        return "você subiu na Bicicleta";
    }
    public String pedalar() {
        return "pedalando, cuidado para não cair";
    }

    public String freiar() {
        return "você bateu";
    }


    public String sair() {
        return "Saiu com sucesso";
    }

    public String dar_grau() {
        return "você caiu porque foi inventar moda";
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "nome='" + nome + '\'' +
                ", aro='" + aro + '\'' +
                ", material ='" + material + '\'' +
                '}';
    }
}