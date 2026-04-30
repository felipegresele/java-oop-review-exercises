package NivelIntermediario.heranca_multipla;

//Herança ultipla extender de uma super classe e tambem implemetar uma ou mais interface na mesma classe
public class NinjaDeFogo extends Ninja implements PoderFogoIntereface, PoderCortinaFumacaInterface{

    public NinjaDeFogo() {
        super();
    }

    public NinjaDeFogo(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    @Override
    public void saudacoes() {
        System.out.println("Eu sou o " + nome + " tenho " + idade + " anos, sou da aldeia " + aldeia);
    }

    @Override
    public void jogarBolasDeFogoComAsMaos() {
        System.out.println("Ativando poder de jogar bolas de fogo nos inimigos!");
    }

    @Override
    public void criarCortinhaFumaca() {
        System.out.println("Recebendo ataque, criando cortinha de fumaça para fugir...");
    }

}
