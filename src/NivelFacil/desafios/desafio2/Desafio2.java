package NivelFacil.desafios.desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int NUMERO_MAX = 5;
        String[] ninjasArray = new String[NUMERO_MAX];

        int opcaoMenuEscolhida = 0;
        int ninjasCadastrados = 0;

        while(opcaoMenuEscolhida != 3) {
            System.out.println("========================");
            System.out.println("/n-- Menu --");
            System.out.println("1 - Cadastrar ninja");
            System.out.println("2 - Ver lista de ninjas");
            System.out.println("3 - Sair");
            System.out.println("========================");
            System.out.println("Escolha uma opção");
            opcaoMenuEscolhida = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoMenuEscolhida) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                    System.out.println("Insira o nome do ninja que deseja cadastrar:");
                    String nomeNinja = scanner.nextLine();
                    ninjasArray[ninjasCadastrados] = nomeNinja;
                    ninjasCadastrados++;
                    System.out.println("O ninja " + nomeNinja + " foi adicionado");
                    break;
                } else {
                        System.out.println("A lista de ninjas já está cheia");
                        break;
                    }
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("A lista está vazia!");
                        break;
                    } else {
                        for (int i = 0; i < ninjasArray.length; i++) {
                            System.out.println(i + "Ninja: " + ninjasArray[i]);
                        }
                        break;
                    }
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Insira uma opcão correta! Tente novamente");
                    break;
            }
        }
        //fechando scanner
        scanner.close();

    }
}
