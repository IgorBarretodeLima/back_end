public class Bichinho {

    private String nome;
    private String dt_nacimento;
    private int fome;
    private int energia;
    private int humor;
    public int gethumor = (getenergia()*getfome())/2;
    public String getnome(){
        return "tutu";
    } public String getDt_nacimento(){
        return "11/9/2001";
    } public int getfome(){
        return 70;
    } public int getenergia(){
        return 70;
    } public int gethumor(){
        return 50;
    }
    // Setter para alterar o dado
    public void setNome(String nome) {
        this.nome = nome;
    } public void setDt_nacimento(String dt_nacimento) {
        this.dt_nacimento = dt_nacimento;
    } public void setfome(int fome) {
        this.fome = fome;
    } public void setEnergia(int energia) {
        this.energia = energia;
    } public void sethumor(int humor) {
        this.humor = humor;
    }
    public String brincar() {
        return "você esta brincando com ele";
    }
    public String comer() {
        return "ele está comendo";
    }
    public String dormir() {
        return "ele está dormindo";
    }
    }

