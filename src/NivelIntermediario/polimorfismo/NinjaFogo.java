package NivelIntermediario.polimorfismo;

public class NinjaFogo extends Ninja{

    //Sobrescrita de metodo
    //@Override serve para sobreescrever um metodo que ja existe e adptalo para a classe atual que está
    @Override
    public void mostrarHabilidade() {
        System.out.println("Eu sou " + nome + " , minha habilidade especial é de fogo");
    }

}
