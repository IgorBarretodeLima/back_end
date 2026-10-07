import static java.lang.IO.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

void main() {
    List<Pessoas> banco = new ArrayList<>();
    
    banco.add(new Pessoas(1, "Igor", 67));
    banco.add(new Pessoas(2, "Lucca", 16));
    banco.add(new Pessoas(3, "Gabriel", 18));
    banco.add(new Pessoas(4, "Ryan", 19));
    banco.add(new Pessoas(5, "Guilherme", 16));
    banco.add(new Pessoas(6, "Gusta", 19));
    banco.add(new Pessoas(7, "Vitor", 17));

    List<Pessoas> cache = new ArrayList<>();
    final int CACHE_MAX = 10;

    Scanner sc = new Scanner(System.in);

    while (true) {
        print("\nDigite o ID da pessoa (ou 0 para sair): ");
        int idBuscado = sc.nextInt();
        if (idBuscado == 0) {
            println("Programa encerrado.");
            break;
        }

        Pessoas encontradaNoCache = null;
        for (Pessoas p : cache) {
            if (p.id == idBuscado) {
                encontradaNoCache = p;
                break;
            }
        }
        if (encontradaNoCache != null) {
            println("Pessoa foi encontrada no cache: " + encontradaNoCache);
        } else {
            Pessoas encontradaNoBanco = null;
            for (Pessoas p : banco) {
                if (p.id == idBuscado) {
                    encontradaNoBanco = p;
                    break;
                }
            }

            if (encontradaNoBanco != null) {
                if (cache.size() >= CACHE_MAX) {
                    Pessoas removida = cache.remove(0); // remove a mais antiga
                    println("Cache cheio, está sendo removida a pessoa mais antiga: " + removida);
                }

                cache.add(encontradaNoBanco);
                println("Pessoa buscada no banco e adicionada ao cache: " + encontradaNoBanco);
            } else {
                println("Pessoa com ID " + idBuscado + " não encontrada no banco.");
            }
        }

        println("Cache atual (" + cache.size() + "/" + CACHE_MAX + "): " + cache);
    }

    sc.close();
}