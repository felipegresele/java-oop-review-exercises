package NivelIntermediario.heranca_multipla;

//Herança multípla é extender de uma super classe e também implemetar uma ou mais interfaces na mesma classe
//Contato que aceite os termos da interface pode usar infinitas classes em uma única classe
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
