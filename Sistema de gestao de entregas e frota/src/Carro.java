public class Carro extends Veiculo {

    public Carro(String placa, String modelo, double custoPorKm) {
        super(placa, modelo, custoPorKm);
    }

    @Override
    public double calcularCustoViagem(double distanciaKm) {
        validarDistancia(distanciaKm);

        return (distanciaKm * getCustoPorKm()) * 1.10;
    }
}