package NivelIntermediario.desafios.desafio1;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade +
                " , Missão: " + missao + " , Nivel dificuldade: "
                + nivelDificuldaeMissao + " , Status missao: " + statusMissao
                + " , A habilidade especial é: " + habilidadeEspecial
        );
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("A habilidade especial é: " + habilidadeEspecial);
    }
}
