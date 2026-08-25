class Personagem {
    private String nomep;
    private int vida;
    private int energiap;
    private int nivel;

    public Personagem(String nome) {
        this.nomep = nome;
        this.energiap = 100;
        this.vida = 100;
        this.nivel = 1;
    }

    public String getNomep() {
        return nomep;
    }

    public int getEnergiap() {
        return energiap;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    // Métodos corrigidos para retornar String e sem parâmetros desnecessários
    public String lutar() {
        if (this.vida <= 0) {
            return "Ele está morto e não pode lutar";
        } else {
            this.vida -= 30;
            this.energiap -= 30;
            this.nivel += 1;
            return "Ele está lutando contra a Pipoca com sal";
        }
    }

    public String comer() {
        if (this.vida <= 0) {
            return "Ele está morto e não pode comer";
        } else {
            this.vida = 100; // Restaura a vida ao máximo
            return "Ele está comendo";
        }
    }

    public String dormir() {
        if (this.vida <= 0) {
            return "Ele está morto e não pode dormir";
        } else {
            this.energiap = 100; // Restaura a energia ao máximo
            return "Ele está dormindo para recuperar a energia";
        }
    }
}