package NivelFacil.desafios.exercicios;

import java.util.Scanner;

public class DesafioCarro {

    /*
    * Cadastrar carro
    * Lista carros salvos
    * Deletar buscar
    * Buscar carro
    * Sair do programa
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NUMERO_MAXIMO = 5;
        String[] listaCarros = new String[NUMERO_MAXIMO];

        int opcaoEscolhida = 0;
        int carrosCadastrados = 0;

        while (opcaoEscolhida != 4) {
            System.out.println("Menu de Opções");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Lista carros salvos");
            System.out.println("3 - Deletar carro");
            System.out.println("4 - Sair do programa");
            opcaoEscolhida = scanner.nextInt();
            scanner.nextLine();

            switch(opcaoEscolhida) {
                case 1:
                    if (carrosCadastrados < NUMERO_MAXIMO) {
                        System.out.println("Digite o nome do carro que deseja salvar");
                        String carro = scanner.nextLine();
                        //Adiciona + 1 a cada carro que adicionar
                        listaCarros[carrosCadastrados] = carro;
                        carrosCadastrados++;
                        break;
                    } else {
                        System.out.println("Impossível adicionar mais! A lista já está cheia");
                        break;
                    }
                case 2:
                    if (carrosCadastrados != 0) {
                        System.out.println("Lista de carros:");
                        for (int i = 0; i < listaCarros.length; i++) {
                            System.out.println((i + 1) + " - " + listaCarros[i]);
                        }
                        break;
                    } else {
                        System.out.println("Lista vazia!");
                        break;
                    }
                case 3:
                    if (carrosCadastrados != 0) {
                        System.out.println("Digite o index do carro que deseja excluir:");
                        int indice = scanner.nextInt();
                        if (indice < 0 || indice >= listaCarros.length) {
                            System.out.println("Indice inválido!");
                        }
                        for (int i = 0; i < listaCarros.length; i++) {
                            //adicionando mais um index
                            System.out.println(i + " - " + listaCarros[i + 1]);
                            break;
                        }
                        listaCarros[carrosCadastrados - 1] = null;
                        carrosCadastrados--;
                        break;
                    } else {
                        System.out.println("Lista vazia!");
                        break;
                    }
                case 4:
                    System.out.println("Saindo...");
            }
        }
    }




}
