public enum StatusVeiculo {
    DISPONIVEL("Disponível"),
    EM_MANUTENCAO("Em Manutenção"),
    EM_VIAGEM("Em Viagem");

    private String descricao;

    StatusVeiculo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}