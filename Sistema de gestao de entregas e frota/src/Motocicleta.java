public class Motocicleta extends Veiculo {

    public Motocicleta(String placa, String modelo, double custoPorKm) {
        super(placa, modelo, custoPorKm);
    }

    @Override
    public double calcularCustoViagem(double distanciaKm) {
        validarDistancia(distanciaKm);
        double taxaFixa = 10.0;
        return (distanciaKm * getCustoPorKm()) + taxaFixa;
    }
}