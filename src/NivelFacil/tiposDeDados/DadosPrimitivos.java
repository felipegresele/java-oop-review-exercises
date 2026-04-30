package NivelFacil.tiposDeDados;

public class DadosPrimitivos {

    //classe main que vai rodar o projeto todo
    //classe de compilação - tudo que está dentro dela é o que o java vai rodar em execução
    public static void main(String[] args) {

        /*
        * Dados primitivos - int, double, float, char, boolean, short
        * Objetivo da aula - Criar um ninja
        * */

        Integer idade = 18; //Valor máximo: 2147483647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = false;
        Long saldoBancario = 999999L; //serve para numeros muito grandes

        System.out.println("Ninja 1"); //println pula linha
        System.out.print("Idade: " + idade);

    }
}
