import static java.lang.IO.*;

void main() {
    Personagem p1 = new Personagem("tiririca");
    boolean executando = true;

    while (executando) {
        println("\nPersonagem de Jogo\n");
        String opcao = readln("1-Apresentação | 2-Lutar | 3-Dormir | 4-Comer | 5-Status | 0-Sair\nOpção: ");

        switch (opcao) {
            case "1":
                println("Ola eu sou o " + p1.getNomep() + " do ceara");
                break;

            case "2":
                println(p1.lutar() + "; Ele perdeu 30 de vida e está com " + p1.getVida() +
                        ", perdeu 30 de energia e está com " + p1.getEnergiap() +
                        " e upou pro " + p1.getNivel() + "|LV");
                break;

            case "3":
                println(p1.dormir() + ", ele recuperou a sua energia e está com " + p1.getEnergiap());
                break;

            case "4":
                println(p1.comer() + ", ele recuperou a sua vida e está com " + p1.getVida());
                break;

            case "5":
                if (p1.getVida() <= 0) {
                    println("O " + p1.getNomep() + " está morto com " + p1.getNivel() + " LV | " + p1.getEnergiap() + " Energia");
                } else {
                    println("O " + p1.getNomep() + " está vivo com " + p1.getNivel() + " LV | " + p1.getEnergiap() + " Energia | " + p1.getVida() + " Vida");
                }
                break;

            case "0":
                println("Encerrando...");
                executando = false;
                break;

            default:
                println("Opção inválida!");
        }
    }
}