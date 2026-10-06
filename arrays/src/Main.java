import static java.lang.IO.*;
    void main(){

        List<Pessoas> banco = new ArrayList<>();
        List<Pessoas> cache = new ArrayList<>();

        banco.add(new Pessoas(1, "Igor", 67));
        banco.add(new Pessoas(2, "Tutui", 18));
        banco.add(new Pessoas(3, "Vitor", 17));
        banco.add(new Pessoas(4, "Guilherme", 16));
        banco.add(new Pessoas(5, "Ryan", 19));
        banco.add(new Pessoas(6, "Rato", 20));
        banco.add(new Pessoas(7, "Gabriel", 18));
        banco.add(new Pessoas(8, "Lucca", 16));
        banco.add(new Pessoas(9, "Gusta", 18));
        banco.add(new Pessoas(10, "Nicolas", 18));
        banco.add(new Pessoas(11, "Fulano", 99));

        Scanner sc = new Scanner(System.in);

        while (true) {
            print("\nDigite o ID da pessoa\n para sair digite -1");
            int idBusca = sc.nextInt();
            if (idBusca == -1) break;

            Pessoas emCache = buscar(cache, idBusca);

            if (emCache != null) {
                System.out.println("Pessoa encontrada dentro do cache: " + emCache);
            } else {
                Pessoas noBanco = buscar(banco, idBusca);

                if (noBanco != null) { // Chaves adicionadas aqui!
                    if (cache.size() >= 10) {
                        Pessoas removida = cache.remove(0);
                        println("Cache cheio, está sendo removido do cache: " + removida.getNome());
                    }
                    cache.add(noBanco);
                    println("Pessoa buscada no banco e adicionada ao cache: " + noBanco);
                } else {
                    println("Pessoa não encontrada no banco de dados.");
                }
            }
        }
    }

    private static Pessoas buscar(List<Pessoas> lista, int id) {
        for (Pessoas p : lista) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }