public class Paciente {
    private String nomeAcompanhante;
    private String nomeAnimal;
    private String raca;

    public Paciente(String nomeAcompanhante, String nomeAnimal, String raca) {
        this.nomeAcompanhante = nomeAcompanhante;
        this.nomeAnimal = nomeAnimal;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Animal: " + nomeAnimal + " | Raça: " + raca + " | Acompanhante: " + nomeAcompanhante;
    }
}