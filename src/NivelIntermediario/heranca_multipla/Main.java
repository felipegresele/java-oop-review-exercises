package NivelIntermediario.heranca_multipla;

public class Main {

    public static void main(String[] args) {

        NinjaDeFogo ninjaDeFogo = new NinjaDeFogo("Kamzu", 22, "Aldeia do fogo");
        ninjaDeFogo.saudacoes();
        ninjaDeFogo.jogarBolasDeFogoComAsMaos();
        ninjaDeFogo.criarCortinhaFumaca();

        NinjaDeLava ninjaDeLava = new NinjaDeLava("LavaMan", 20, "Aldeia da lava");
        ninjaDeLava.saudacoes();
        ninjaDeLava.jogarBolasDeFogoComAsMaos();
        ninjaDeLava.jogarPedregulhos();
    }
}
