void main() {
    var cofrinho = new Cofrinho("Viagem para a praia", 500.0);

    System.out.println("=== ESTADO INICIAL ===");
    imprimirStatus(cofrinho);

    System.out.println("\n=== TESTANDO DEPÓSITO INVÁLIDO ===");
    cofrinho.adicionarDinheiro(-50.0);

    System.out.println("\n=== DEPOSITANDO PRIMEIRA PARTE ===");
    cofrinho.adicionarDinheiro(200.0);
    imprimirStatus(cofrinho);

    System.out.println("\n=== TESTANDO SAQUE MAIOR QUE O SALDO ===");
    cofrinho.retirarDinheiro(300.0);

    System.out.println("\n=== RETIRANDO VALOR VÁLIDO ===");
    cofrinho.retirarDinheiro(50.0);
    imprimirStatus(cofrinho);

    System.out.println("\n=== COMPLETANDO A META ===");
    cofrinho.adicionarDinheiro(350.0);
    imprimirStatus(cofrinho);

    System.out.println("\n=== ULTRAPASSANDO A META ===");
    cofrinho.adicionarDinheiro(100.0);
    imprimirStatus(cofrinho);
}

void imprimirStatus(Cofrinho cofrinho) {
    System.out.println("Nome: " + cofrinho.getNome());
    System.out.println("Saldo: R$ " + cofrinho.getSaldo());
    System.out.println("Meta: R$ " + cofrinho.getMeta());
    System.out.printf("Progresso: %.2f%%\n", cofrinho.getProgresso());
    System.out.println("Status: " + cofrinho.getStatus());
}