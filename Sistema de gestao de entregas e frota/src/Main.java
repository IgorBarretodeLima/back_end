public class Main {
    public static void main(String[] args) {
        System.out.println(" CRIAÇÃO DOS VEÍCULOS ");
        Motocicleta moto = new Motocicleta("MTO1A23", "Honda CG 160", 0.6667);
        Carro carro = new Carro("CAR2B34", "Fiat Fiorino", 1.50);
        Caminhao caminhao = new Caminhao("ABC1D23", "Volvo FH", 6.50, 15000.0);

        System.out.println("\n TESTES DE VALIDAÇÃO E REGRAS DE NEGÓCIO ");


        try {
            Motocicleta motoInvalida = new Motocicleta("INV1234", "Biz", -1.0);
        } catch (IllegalArgumentException e) {
            System.out.println("[TESTE OK] Custo/Km inválido capturado: " + e.getMessage());
        }


        try {
            moto.calcularCustoViagem(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("[TESTE OK] Distância negativa capturada: " + e.getMessage());
        }


        try {
            caminhao.carregar(18000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("[TESTE OK] Carga acima do limite capturada: " + e.getMessage());
        }


        caminhao.carregar(10000.0);

        System.out.println("\n DEMONSTRAÇÃO DE CÁLCULOS E POLIMORFISMO ");

        System.out.println("\n Entrega 1: Caminhão Ok ");
        Entrega e1 = new Entrega(caminhao, 350);
        e1.processarEntrega();

        System.out.println("\n Entrega 2: Motocicleta Ok ");
        Entrega e2 = new Entrega(moto, 30);
        e2.processarEntrega();

        System.out.println("\n Entrega 3: Carro Ok ");
        Entrega e3 = new Entrega(carro, 100);
        e3.processarEntrega();

        System.out.println("\n  TESTE DE MANUTENÇÃO E BLOQUEIO DE ENTREGA ");
        Carro carroManutencao = new Carro("DEF4G56", "Mercedes Vito", 1.50);
        carroManutencao.enviarParaManutencao();

        System.out.println("\n Tentativa de entrega com veículo indisponível ");
        Entrega e4 = new Entrega(carroManutencao, 120);
        e4.processarEntrega();

        System.out.println("\n Liberação do veículo e nova tentativa ");
        carroManutencao.liberarDaManutencao();
        Entrega e5 = new Entrega(carroManutencao, 120);
        e5.processarEntrega();
    }
}