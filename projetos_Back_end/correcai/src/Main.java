import static java.lang.IO.*;

void main() {
    tamagotchi b = new tamagotchi("rasputia");
    boolean executando = true;

    while (executando) {
        String opcao = readln("escolha uma opção\n 1: Ver como está a fome dele\n 2: Ver como está o humor dele\n 3: Ver como está a energia dele\n 4: Ver quais são as informações dele\n 5: Brincar com ele\n 6: dar comida para ele\n 7: fazer ele dormir\n 8: Sair do jogo");

        switch (opcao) {
            case "1" -> println("Fome: " + b.getFome());
            case "2" -> println("Humor: " + b.getHumor());
            case "3" -> println("A energia é: " + b.getEnergia());
            case "4" -> {
                println("Nome: " + b.getNome());
            }
            case "5" -> println(b.brincar()+" o humor dele esta em:"+ (b.getHumor()));
            case "6" -> println(b.comer()+" a fome dele esta em:"+ (b.getFome()-30));
            case "7" -> println(b.dormir()+" a energia dele esta em:"+ (b.getEnergia()-30));
            case "8" -> {
                println("Tchau! Até mais.");
                executando = false;
            }
            default -> println("Opção inválida! Escolha um número de 1 a 5.");
        }
    }
}