public class Personagem {
    private String nomep;
    private int vida;
    private int enregiap;
    private int nivel;

    public Personagem(String tiririca) {
        this.nomep = tiririca;
        this.enregiap = 100;
        this.vida = 100;
        this.nivel = 1;
    }

    public String getNomep() {
        return nomep;
    }

    public int getEnergiap() {
        return enregiap;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    //metodos
    public void lutar(int lutar) {
        if (vida < 0) {
            IO.println("Ele esta morto");

        } else {
            IO.println("Ele esta lutado contra a Pipoca com sal");

            this.vida = vida - 30;
            this.enregiap = enregiap - 30;
        }
    }

    public void comer(int comer) {
        if (vida < 0) {
            IO.println("Ele esta morto");
            this.vida = vida + (100 - vida);
        } else {
            IO.println("ele está comendo");

        }
    }

    public void dormir(int dormir) {
        if (vida < 0) {
            IO.println("Ele esta morto");

        } else {
            IO.println("ele está dormindo para recuperar a ernergia");
            this.enregiap = enregiap + (100 - enregiap);
        }

        public void fala(String fala)
        {
            IO.println("Sou euu, tri-ri-rica");
        }

    }
}