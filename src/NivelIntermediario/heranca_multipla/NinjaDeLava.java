package NivelIntermediario.heranca_multipla;

public class NinjaDeLava extends Ninja implements PoderFogoIntereface, PoderDeLavaInterface{

    public NinjaDeLava() {
        super();
    }

    public NinjaDeLava(String nome, int idade, String aldeia) {
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
    public void jogarPedregulhos() {
        System.out.println("Recebendo ataque, jogando pedras de lava nos inimigos!");
    }

}
