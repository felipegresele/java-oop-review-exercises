package NivelIntermediario.hashMap;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> listaUsandoSet = new HashSet<>();

        //Principais com add(), addAll(), remove(), removAll(), contains() e containsAll(), size() e isEmpty()

        //Lista usando HashSet
        listaUsandoSet.add("Ninja com Garra");
        listaUsandoSet.add("Ninja de Água");
        listaUsandoSet.add("Ninja de Fogo");

        //Retira os duplicados
        //Ordena por ordem alfabetica
        listaUsandoSet.add("Ninja de Fogo");

        listaUsandoSet.remove("Ninja de Água");
        System.out.println(listaUsandoSet);

        System.out.println(listaUsandoSet.contains("Ninja de Fogo"));

        System.out.println(listaUsandoSet.size());

        System.out.println("Verifica se está vazio a lista: " + listaUsandoSet.size());

        System.out.println(listaUsandoSet);

    }

}
