package NivelIntermediario.array_list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Lista são estaticas, não precisa passar tamanho definido
        //Pode aumentar ou diminuir quantas vezes precisar
        List<String> lista = new ArrayList<>();

        //Metódos do List mais utilizados

        //add para adicionar um elemento novo na lista
        lista.add("ninja 1"); //Index 0
        lista.add("ninja 2"); //Index 1
        lista.add("ninja 3"); //Index 2
        lista.add("ninja 4"); //Index 3

        //Ja vem com toString() automaticamente
        System.out.println(lista);

        //remove para remover um elemento da lista
        lista.remove("ninja 4");
        System.out.println(lista);

        //set para trocar um elemento da lista
        // primeiro parametro é o index do elemento na lista e segundo elemento é pelo o que vai trocar o valor atual
        lista.set(2, "ninja atualizado");
        System.out.println(lista);

        //size() para ver o tamanho da lista
        System.out.println(lista.size());

    }
}
