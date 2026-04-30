package NivelIntermediario.polimorfismo;

public class Main {

    public static void main(String[] args) {
        Ninja ninja = new Ninja();

        ninja.nome = "Ninja normal";
        ninja.mostrarHabilidade();

        NinjaFogo ninjaFogo = new NinjaFogo();
        ninjaFogo.nome = "Ninja de Fogo";
        ninjaFogo.mostrarHabilidade();
    }

}
