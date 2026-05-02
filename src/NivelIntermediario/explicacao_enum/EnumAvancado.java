package NivelIntermediario.explicacao_enum;

public enum EnumAvancado {
    //Todos devem ter descricaoMissao e horasParaCompletar
    BASICO("Resgatar Gato no telhado", 1),
    MODERADO("Resgatar Gato no vizinho", 3),
    DIFICIL("Resgatar Gato na arvore", 5);

    private String descricaoMissao;
    private int horasParaCompletar;

    //Obriga todos os ENUMS a ter os dois atributos
    EnumAvancado(String descricaoMissao, int horasParaCompletar) {
        this.descricaoMissao = descricaoMissao;
        this.horasParaCompletar = horasParaCompletar;
    }

    public String getDescricaoMissao() {
        return descricaoMissao;
    }

    public int getHorasParaCompletar() {
        return horasParaCompletar;
    }
}
