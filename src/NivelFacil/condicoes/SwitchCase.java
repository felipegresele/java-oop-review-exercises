package NivelFacil.condicoes;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do ninja que deseja escolher");
        System.out.println("1 - Ninja Azul");
        System.out.println("2 - Ninja Amarelo");
        System.out.println("3 - Ninja Vermelho");

        int numeroEscolhido = scanner.nextInt();

        System.out.println("Número digitado: " + numeroEscolhido);

        //o paramtro é em qual variavel o switch vai fazer a verificação de condições
        //testar casos especificos
        switch(numeroEscolhido) {
            //case x - o x é o que foi digitado pelo usuário
            case 1:
                System.out.println("Você escolheu o Ninja Azul");
                break;
            case 2:
                System.out.println("Você escolheu o Ninja Amarelo");
                break;
            case 3:
                System.out.println("Você escolheu o Ninja Vermelho");
                break;
            default: //Se o usuário escolher alguma opção diferente das acima
                System.out.println("Você digitou o número errado! Tente novamente");
                return;
        }

        //fechando scanner
        scanner.close();
    }
}
