package NivelIntermediario.desafios.desafio1;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldaeMissao;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade +
                " , Missão: " + missao + " , Nivel dificuldade: "
                + nivelDificuldaeMissao + " , Status missao: " + statusMissao);
    }
}
