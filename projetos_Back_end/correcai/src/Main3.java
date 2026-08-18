import static java.lang.IO.*;

void main() {
    Personagem p1 = new Personagem("tiririca");
    boolean executando = true;

    while (executando) {

        println("\nPersonagem de Jogo\n");
        String opcao = readln("1-Apresentação | 2-Lutar | 3-Dormir | 4-Comer | 5-Fala especial | 6-Statut | 0-Sair\nOpção: ");

        switch (opcao) {
            case "1":
            println("Ola eu sou o tiririca do ceara");
                break;

            case "2":
                println(p1.lutar() + "; Ele perdeu " + (p1.getVida()-30) + " de vida, perdeu " + (p1.getEnergiap()-30) + " e upou " + (p1.getNivel()+1) + " de LV");

                break;

            case "3":
                println(p1.dormir() + ", ele recuperou a sua energia" + (p1.getEnergiap() + (100 - p1.getEnergiap())));
                break;

            case "4":
                println(p1.comer() + ", ele recuperou a sua vida" + (p1.getVida() + (100 - p1.getVida())));
                break;

            case "5":
                println(p1.fala());
                break;

            case "6":
                if (p1.getVida() < 0)
                { println("O tiririca está morto com " + p1.getNivel() + "LV| " + p1.getEnergiap() + "Energia");
                } else {
                    println("O tiririca está vivo com " + p1.getNivel() + "LV| " + p1.getEnergiap() + "Energia| " + p1.getVida() + "Vida");

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