public class tamagotchi {

    private String nome;
    private int fome;
    private int energia;
    private String humor;

    public tamagotchi (String nome){
        this.nome = nome;
        energia = 50;
        fome = 50;
        humor = "Neutro";
    }

    public String getNome(){
        return  nome;
    }
    public int getFome(){
        return  fome;
    }
    public int getEnergia(){
        return energia;
    }
    public  String getHumor(){
        if (energia > 75 && fome < 25){
            return   humor = "Doidão";
        } else if (energia > 50 && 50 < fome) {
            return humor = "ok pode comer";
        } else if(energia > 25 && fome < 75){
            return humor = "cansado e com fome";
        }else {
            return humor = "Famito e triste";
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setfome(int fome) {
        if (fome>= 0 && fome <= 100){
            this.fome = fome;
        }

    } public void setEnergia(int energia) {
        if (energia>= 0 && energia <= 100){
            this.energia = energia;}

    } public void sethumor(String humor) {
        this.humor = humor;

    }   public String brincar() {
        return "você esta brincando com ele";
    }
    public String comer() {
        return "ele está comendo";
    }
    public String dormir() {
        return "ele está dormindo";
    }
}

