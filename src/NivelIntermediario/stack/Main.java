package NivelIntermediario.stack;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //3 formas de criar lista no Java
        int[] listaNumeros = new int[3];

        listaNumeros[0] = 1;
        listaNumeros[1] = 2;
        listaNumeros[2] = 3;

        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("felipe");
        listaNomes.add("jose");
        listaNomes.add("pedro");

        //Queue é uma lista em FILA
        //Quem chegou primeiro vai sair primeiro

        Queue<String> listaQueue = new LinkedList<>();

        //Stack é uma lista vertical, adiciona um elemento a cima do outro
        //O ultimo elemento adicionado vira o primeiro na lista

        Stack<String> listaNinjas = new Stack<>();

        //Principais metodos - add(), push(), pop(), peek() e size()

        //add() é para adicionar o primeiro elemento
        listaNinjas.add("Ninja 1");
        System.out.println("Lista ninjas: " + listaNinjas);

        //push() é para adicionar novos elementos a lista
        listaNinjas.push("Ninja 2");
        listaNinjas.push("Ninja 3");
        listaNinjas.push("Ninja 4");

        System.out.println("Adicionando ninjas: " + listaNinjas);

        //pop() é para tirar o ultimo elemento que foi adicionado
        listaNinjas.pop();
        System.out.println("POP na lista: " + listaNinjas);

        //peek() retorna qual é o primeiro elemento da lista (ultimo adicionado)
        System.out.println("Ultimo elemento adicionado: " + listaNinjas.peek());

        //size() retorna tamanho da lista
        listaNinjas.size();
        System.out.println("Tamanho " + listaNinjas.size());

        System.out.println("Lista ninjas final: " + listaNinjas);
    }
}
