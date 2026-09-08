public class Caminhao extends Veiculo {
    private double capacidadeMaximaKg;
    private double pesoCargaAtualKg;

    public Caminhao(String placa, String modelo, double custoPorKm, double capacidadeMaximaKg) {
        super(placa, modelo, custoPorKm);
        if (capacidadeMaximaKg <= 0) {
            throw new IllegalArgumentException ("A capacidade máxima deve ser maior que zero.");
        }
        this.capacidadeMaximaKg = capacidadeMaximaKg;
        this.pesoCargaAtualKg = 0;
    }

    public void carregar(double pesoKg) {
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("O peso da carga deve ser maior que zero.");
        }
        if (pesoKg > capacidadeMaximaKg) {
            throw new IllegalArgumentException("Carga de " + pesoKg + " kg excede a capacidade máxima de " + capacidadeMaximaKg + " kg.");
        }
        this.pesoCargaAtualKg = pesoKg;
        System.out.println("Caminhão carregado com " + pesoKg + " kg.");
    }

    @Override
    public double calcularCustoViagem(double distanciaKm) {
        validarDistancia(distanciaKm);

        double taxaAdicionalCarga = (pesoCargaAtualKg / 1000.0) * 0.05 * distanciaKm;
        return (distanciaKm * getCustoPorKm()) + taxaAdicionalCarga;
    }

    public double getCapacidadeMaximaKg() { return capacidadeMaximaKg; }
    public double getPesoCargaAtualKg() { return pesoCargaAtualKg; }
}