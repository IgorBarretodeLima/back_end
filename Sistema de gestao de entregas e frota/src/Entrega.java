public class Entrega {
    private Veiculo veiculo;
    private double distanciaKm;

    public Entrega(Veiculo veiculo, double distanciaKm) {
        this.veiculo = veiculo;
        this.distanciaKm = distanciaKm;
    }

    public void processarEntrega() {
        System.out.println("Veículo: " + veiculo.getPlaca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Situação: " + veiculo.getStatus().getDescricao());
        System.out.println("Distância: " + distanciaKm + " km");

        if (veiculo instanceof Caminhao) {
            Caminhao c = (Caminhao) veiculo;
            System.out.println("Peso da carga: " + c.getPesoCargaAtualKg() + " kg");
        }

        else if (veiculo.getStatus() == StatusVeiculo.EM_MANUTENCAO) {
            System.out.println("A entrega não pode ser iniciada.");
            return;
        }

        else  {
            double custo = veiculo.calcularCustoViagem(distanciaKm);
            System.out.print("Custo previsto: R$\n" + custo);
            veiculo.iniciarEntrega();

        }
    }
}