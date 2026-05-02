package NivelIntermediario.explicacao_enum;

public class Missao {

    String nomeRelatorMissao;
    EnumAvancado descricaoMissao;

    void descricaoMissao() {
        System.out.println("A missão foi cumprida por "
                + nomeRelatorMissao + ", Descrição "
                + descricaoMissao + " - "
                + descricaoMissao.getDescricaoMissao() + " - " + "Durou "
                + descricaoMissao.getHorasParaCompletar() + " horas para realizar");
    }

    public Missao(String nomeRelatorMissao, EnumAvancado descricaoMissao) {
        this.nomeRelatorMissao = nomeRelatorMissao;
        this.descricaoMissao = descricaoMissao;
    }


}
