package NivelAvançado.escopo_static;

public class Ninja {

    public String nome;

    public void sharigan() {
        System.out.println("Sharingan - metódo não estatico");
    }

    public static void jogarShurikein() {
        System.out.println("Jogar Shurikein - metódo estatico");
    }
}
