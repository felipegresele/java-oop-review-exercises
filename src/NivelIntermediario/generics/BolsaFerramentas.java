package NivelIntermediario.generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaFerramentas<T> {

    List<T> ferramentas = new ArrayList<>();

    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    public void mostrarFerramentas() {
        for (T ferramenta : ferramentas) {
            System.out.println("A ferramenta é " + ferramenta);
        }
    }

    @Override
    public String toString() {
        return "Itens na mochila: " + ferramentas.toString();
    }

}
