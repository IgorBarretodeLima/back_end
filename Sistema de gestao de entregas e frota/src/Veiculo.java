public abstract class Veiculo {
    private String placa;
    private String modelo;
    private double custoPorKm;
    private StatusVeiculo status;

    public Veiculo(String placa, String modelo, double custoPorKm) {
        if (custoPorKm <= 0) {
            throw new IllegalArgumentException ("O custo por quilômetro deve ser maior que zero.");
        }
        this.placa = placa;
        this.modelo = modelo;
        this.custoPorKm = custoPorKm;
        this.status = StatusVeiculo.DISPONIVEL;
    }

    public abstract double calcularCustoViagem(double distanciaKm);

    public boolean iniciarEntrega() {
        if (this.status == StatusVeiculo.EM_MANUTENCAO) {
            System.out.println("A entrega não pode ser iniciada: Veículo em manutenção.");
            return false;
        }
        if (this.status == StatusVeiculo.EM_VIAGEM) {
            System.out.println("A entrega não pode ser iniciada: Veículo já está em viagem.");
            return false;
        }
        this.status = StatusVeiculo.EM_VIAGEM;
        System.out.println("Entrega iniciada com sucesso.");
        return true;
    }

    public void enviarParaManutencao() {
        this.status = StatusVeiculo.EM_MANUTENCAO;
        System.out.println("Veículo " + placa + " enviado para manutenção.");
    }

    public void liberarDaManutencao() {
        this.status = StatusVeiculo.DISPONIVEL;
        System.out.println("Veículo " + placa + " liberado da manutenção.");
    }

    protected void validarDistancia(double distanciaKm) {
        if (distanciaKm <= 0) {
            throw new IllegalArgumentException("A distância da viagem deve ser maior que zero.");
        }
    }
    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public double getCustoPorKm() { return custoPorKm; }
    public StatusVeiculo getStatus() { return status; }
}