import static java.lang.IO.*;

void main() {
    println("CADASTRO DE FUNCIONÁRIOS");

    println("\nCadastro Gerente");
    String nomeGe = lerTextoNaoVazio("Digite o nome do gerente: ");
    String cpfGe = lerCpfValido("Digite o CPF do gerente (11 dígitos): ");
    double salarioGe = lerDoublePositivo("Digite o salário do gerente (mínimo R$ 1620.00): ", 1620.00);

    Funcionario ge = new Gerente(nomeGe, cpfGe, salarioGe);

    println("\nCadastro Desenvolvedor");
    String nomeDe = lerTextoNaoVazio("Digite o nome do desenvolvedor: ");
    String cpfDe = lerCpfValido("Digite o CPF do desenvolvedor (11 dígitos): ");
    double salarioDe = lerDoublePositivo("Digite o salário do desenvolvedor (mínimo R$ 1620.00): ", 1620.00);

    Funcionario de = new Desenvolvedor(nomeDe, cpfDe, salarioDe);

    println("\nCadastro Vendedor");
    String nomeVe = lerTextoNaoVazio("Digite o nome do vendedor: ");
    String cpfVe = lerCpfValido("Digite o CPF do vendedor (11 dígitos): ");
    double salarioVe = lerDoublePositivo("Digite o salário do vendedor (mínimo R$ 1620.00): ", 1620.00);
    double totalVendasVe = lerDoublePositivo("Digite o total de vendas do vendedor: ", 0.0);

    Funcionario ve = new Vendedor(nomeVe, cpfVe, salarioVe, totalVendasVe);

    println("\nHOLERITES");
    println("");
    ge.exibirHolerite();
    println("");
    de.exibirHolerite();
    println("");
    ve.exibirHolerite();
}

// --- Métodos de Validação ---

String lerTextoNaoVazio(String mensagem) {
    String entrada;
    do {
        entrada = readln(mensagem).trim();
        if (entrada.isEmpty()) {
            println("[ERRO] O campo não pode ficar em branco. Tente novamente.");
        }
    } while (entrada.isEmpty());
    return entrada;
}

double lerDoublePositivo(String mensagem, double valorMinimo) {
    while (true) {
        try {
            double valor = Double.parseDouble(readln(mensagem).replace(",", "."));
            if (valor < valorMinimo) {
                println(String.format("[ERRO] O valor deve ser no mínimo R$ %.2f", valorMinimo));
                continue;
            }
            return valor;
        } catch (NumberFormatException e) {
            println("[ERRO] Digite um número válido.");
        }
    }
}

String lerCpfValido(String mensagem) {
    String entrada;
    do {
        entrada = readln(mensagem).trim();
        if (entrada.isEmpty()) {
            println("[ERRO] O campo não pode ficar em branco. Tente novamente.");
        }
    } while (entrada.isEmpty());
    return entrada;
        }
