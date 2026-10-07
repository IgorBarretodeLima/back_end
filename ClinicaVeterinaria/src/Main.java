import static java.lang.IO.*;
import java.util.ArrayList;
import java.util.List;

void main() {

    println("CADASTRO DE FUNCIONÁRIOS");

    println("\nGerente");
    String nomeGe = lerTexto("Nome do gerente: ");
    String cpfGe = lerTexto("CPF do gerente: ");
    double salarioGe = lerDouble("Salário do gerente: ");
    Funcionario gerente = new Gerente(nomeGe, cpfGe, salarioGe);

    println("\nVeterinário");
    String nomeVet = lerTexto("Nome do veterinário: ");
    String cpfVet = lerTexto("CPF do veterinário: ");
    double salarioVet = lerDouble("Salário do veterinário: ");
    int tratados = (int) lerDouble("Número de animais tratados: ");
    Funcionario veterinario = new Veterinario(nomeVet, cpfVet, salarioVet, tratados);

    // Vendedor
    println("\nVendedor");
    String nomeVen = lerTexto("Nome do vendedor: ");
    String cpfVen = lerTexto("CPF do vendedor: ");
    double salarioVen = lerDouble("Salário do vendedor: ");
    double vendas = lerDouble("Total de vendas: ");
    Funcionario vendedor = new Vendedor(nomeVen, cpfVen, salarioVen, vendas);

    println("\nCADASTRO DE PACIENTES");
    List<Paciente> pacientes = new ArrayList<>();

    String acomp1 = lerTexto("Nome do acompanhante 1: ");
    String animal1 = lerTexto("Nome do animal 1: ");
    String raca1 = lerTexto("Raça do animal 1: ");
    pacientes.add(new Paciente(acomp1, animal1, raca1));

    String acomp2 = lerTexto("Nome do acompanhante 2: ");
    String animal2 = lerTexto("Nome do animal 2: ");
    String raca2 = lerTexto("Raça do animal 2: ");
    pacientes.add(new Paciente(acomp2, animal2, raca2));

    println("\n=== CADASTRO DE SERVIÇOS ===");
    List<Faturavel> servicos = new ArrayList<>();

    String desc1 = lerTexto("Descrição do serviço 1: ");
    double valor1 = lerDouble("Valor do serviço 1: ");
    servicos.add(new Servico(desc1, valor1));

    String desc2 = lerTexto("Descrição do serviço 2: ");
    double valor2 = lerDouble("Valor do serviço 2: ");
    servicos.add(new Servico(desc2, valor2));

    println("\n\nHOLERITES");
    gerente.exibirHolerite();
    veterinario.exibirHolerite();
    vendedor.exibirHolerite();

    println("\nNÚMERO DE PACIENTES");
    println("Total de pacientes: " + pacientes.size());

    println("\nDADOS DE TODOS");
    println("\nFuncionários");
    println(gerente.getNome() + " - Gerente");
    println(veterinario.getNome() + " - Veterinário");
    println(vendedor.getNome() + " - Vendedor");

    println("\nPacientes");
    for (Paciente p : pacientes) {
        println(p);
    }

    double despesas = gerente.calcularRemuneracao()
            + veterinario.calcularRemuneracao()
            + vendedor.calcularRemuneracao();

    double faturamento = 0;
    for (Faturavel s : servicos) {
        faturamento += s.getValorTotal();
    }

    double lucro = faturamento - despesas;

    println("\n========== RELATÓRIO FINANCEIRO ==========");
    println("Despesas (salários): R$ " + String.format("%.2f", despesas));
    println("Faturamento: R$ " + String.format("%.2f", faturamento));
    println("Lucro: R$ " + String.format("%.2f", lucro));
}

String lerTexto(String mensagem) {
    String texto;
    do {
        texto = readln(mensagem).trim();
        if (texto.isEmpty()) {
            println("[ERRO] Não pode ficar em branco!");
        }
    } while (texto.isEmpty());
    return texto;
}

double lerDouble(String mensagem) {
    while (true) {
        try {
            return Double.parseDouble(readln(mensagem).replace(",", "."));
        } catch (Exception e) {
            println("[ERRO] Digite um número válido!");
        }
    }
}