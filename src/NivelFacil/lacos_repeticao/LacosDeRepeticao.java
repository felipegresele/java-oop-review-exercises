package NivelFacil.lacos_repeticao;

public class LacosDeRepeticao {

    /*
    * Repetir alguma coisa infitamente ou ate o limite que eu passar no parametro
    * WHILE e FOR
    * */

    public static void main(String[] args) {
        int numeroAtualClones = 0;
        int numeroMaximoClones = 10;

        //while (condição) { o que vai fazer enquanto for valido minha condição}
        while (numeroAtualClones <= numeroMaximoClones) {
            numeroAtualClones++; //numero atual + 1
            System.out.println("O ninja fez mais um clone");
            System.out.println("Clone número: " + numeroAtualClones);
        }

        System.out.println("====================================");

        //mais usado e melhor
        //for (declara variavel, condicao de repetição, enquanto for verdadeiro a condição determino o que acotence com minha variavel)
        // { retorno para mostrar essa variavel }
        for (int i = 0; i <= 10; i++) {
            System.out.println("O ninja fez mais um clone");
            System.out.println("Clone número: " + i);
        }
    }

}
