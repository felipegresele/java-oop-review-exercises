package NivelFacil.condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {

    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Insira o Nome do Ninja aqui");
        String nome = caixaDeTexto.nextLine();
        System.out.println("Nome ninja: " + nome);

        System.out.println("Insira a idade do Ninja aqui");
        int idade = caixaDeTexto.nextInt();
        if (idade >= 30) {
            System.out.println("O ninja nao pode ter 30 anos ou mais");
            System.out.println("Insira a idade do Ninja novamente");
            idade = caixaDeTexto.nextInt();
            if (idade >= 30) {
                return;
            }
        }
        System.out.println("Idade ninja: " + idade + " anos");

        //fechar scanner
        caixaDeTexto.close();
    }

}
