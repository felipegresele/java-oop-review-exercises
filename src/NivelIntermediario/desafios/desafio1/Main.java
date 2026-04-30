package NivelIntermediario.desafios.desafio1;

import NivelIntermediario.heranca.NinjaComPoderes;
import NivelIntermediario.heranca.NinjaFogoEAgua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Uchiha ninja = new Uchiha();

        ninja.nome = "felipe";
        ninja.idade = 21;
        ninja.missao = "Estudar";
        ninja.nivelDificuldaeMissao = "Simples";
        ninja.statusMissao = "Em andamento";

        ninja.habilidadeEspecial = "Fogo";

        ninja.mostrarInformacoes();

        ninja.mostrarHabilidadeEspecial();

        //Bonus
        Scanner scanner = new Scanner(System.in);

        int NUMERO_MAXIMO = 5;
        String[] arr = new String[NUMERO_MAXIMO];

        int opcaoSelecionada = 0;
        int quantidadeNinjasAdicionados = 0;

        while(opcaoSelecionada != 4) {
            System.out.println("Menu");
            System.out.println("1 - Adicionar novo ninja");
            System.out.println("2 - Listar ninjas salvos");
            System.out.println("3 - Atualizar ninjas");
            System.out.println("4 - Sair");
            System.out.println("Digite uma opção");
            opcaoSelecionada = scanner.nextInt();
            scanner.nextLine();

            switch(opcaoSelecionada) {
                case 1: {
                    if (quantidadeNinjasAdicionados < NUMERO_MAXIMO) {
                        System.out.println("Digite o nome aqui:");
                        String nomeNinja = scanner.nextLine();
                        arr[quantidadeNinjasAdicionados] = nomeNinja;
                        quantidadeNinjasAdicionados++;
                        break;
                    } else {
                        System.out.println("Lista cheia!");
                        break;
                    }
                }
                case 2: {
                    if (quantidadeNinjasAdicionados == 0) {
                        System.out.println("Lista vazia!");
                        break;
                    } else {
                        System.out.println("Lista de ninjas salvos");
                        for (int i = 0; i < arr.length; i++) {
                            System.out.println((i + 1)+ " - " + arr[i]);
                        }
                        break;
                    }
                } case 3: {
                    if (quantidadeNinjasAdicionados == 0) {
                        System.out.println("Lista vazia!");
                        break;
                    } else {
                        System.out.println("Lista de ninjas salvos");
                        for (int i = 0; i < arr.length; i++) {
                            System.out.println((i + 1) + " - " + arr[i]);
                        }
                        System.out.println("Digite o index que deseja atualizar");
                        int indice = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o novo nome para o ninja " + arr[indice - 1]);
                        String nomeAtualizado = scanner.nextLine();
                        arr[indice - 1] = nomeAtualizado;
                        System.out.println("Ninja atualizuado!");
                        break;

                    }
                }
                case 4: {
                    System.out.println("Saindo do programa...");
                    break;
                }
                default: {
                    System.out.println("Opção Inválida");
                    break;
                }
            }
        }
        scanner.close();
    }

    NinjaComPoderes ninjaFogoEAgua = new NinjaComPoderes();

}
