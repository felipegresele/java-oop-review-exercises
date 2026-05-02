package NivelIntermediario.desafios.desafio4;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //TODO: Criar uma LinkedList com 7 ninjas

        LinkedList<Ninja> listaNinjas = new LinkedList<>();

        listaNinjas.add(new Ninja("Ryu Hayashi", 22, "Vento"));
        listaNinjas.add(new Ninja("Kenji Takeda", 25, "Fogo"));
        listaNinjas.add(new Ninja("Hiroshi Nakamura", 20, "Terra"));
        listaNinjas.add(new Ninja("Akira Sato", 19, "Relâmpago"));
        listaNinjas.add(new Ninja("Takeshi Mori", 27, "Água"));
        listaNinjas.add(new Ninja("Daichi Kuroda", 23, "Sombras"));
        listaNinjas.add(new Ninja("Ren Ishikawa", 21, "Gelo"));
        System.out.println("Lista Completa: " + listaNinjas);

        listaNinjas.removeFirst();
        System.out.println("Retirando o primeiro: " + listaNinjas);
        listaNinjas.removeLast();
        System.out.println("Retirando o ultimo: " + listaNinjas);

        for (Ninja ninja : listaNinjas) {
            System.out.println("Ninja: " + ninja);
        }

        //listaNinjas.get(posicao do ninja na lista)
        System.out.println("Acessando ninja 3: " + listaNinjas.get(3));
    }
}
