package NivelIntermediario.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BolsaFerramentas<Object> bolsaFerramentas = new BolsaFerramentas<>();

        bolsaFerramentas.adicionarFerramenta(new Shurikein("Shurikein de Fogo"));
        bolsaFerramentas.adicionarFerramenta(new Espada("Espada do Trovão"));
        bolsaFerramentas.adicionarFerramenta(new Granada("Granada de fumaça"));

        bolsaFerramentas.mostrarFerramentas();
    }

}
