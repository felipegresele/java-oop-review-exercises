package NivelFacil.array;

public class Array {

    public static void main(String[] args) {

        //passo o tipo dos dados que vou armazenar no NivelFacil.array
        //3 é a quantidade de espaços que esse NivelFacil.array vai ter e na hora da compilacao do programa
        //para o Java saber quantos espaços vai ter que alocar da memória para guardar os dados no NivelFacil.array
        String[] ninjas = new String[4];
        ninjas[0] = "Ninja 1";
        ninjas[1] = "Ninja 2";
        ninjas[2] = "Ninja 3";

        System.out.println("ninja: " + ninjas[0]);

        //no NivelFacil.array de string se eu acessar um espaço alocado sem valor definido retorna null
        System.out.println(ninjas[3]);

        int[] numeros = new int[2];
        numeros[0] = 10;

        //no NivelFacil.array de inteiros se eu acessar um espaço alocado sem valor definido retorna 0
        System.out.println(numeros[1]);

        double[] flutuantes = new double[1];

        //no NivelFacil.array de double se eu acessar um espaço alocado sem valor definido retorna 0.0
        System.out.println(flutuantes[0]);

        boolean[] verdadeiroOuFalso = new boolean[2];
        verdadeiroOuFalso[0] = true;

        //no NivelFacil.array de boolean se eu acessar um espaço alocado sem valor definido retorna false
        System.out.println(verdadeiroOuFalso[1]);

        //Redeclarar o Array ninjas
        //cria dnv e o NivelFacil.array criado antes perde a referencia na memoria
        ninjas = new String[5];
        ninjas[0] = "ninja 1";
        ninjas[1] = "ninja 2";
        ninjas[2] = "ninja 3";
        ninjas[3] = "ninja 4";

        //valor que declarei agora
        System.out.println(ninjas[0]);

        //retorna null pois o NivelFacil.array antigo perdeu a refenrencia
        //caiu no lixo da memoria do java pois nao esta mais sendo usado
        System.out.println(ninjas[4]);

        for (int i = 0; i < 5; i++) {
            //vai pegar os valores do indice de cada posicao do NivelFacil.array
            System.out.println(ninjas[i]);
        }


    }

}
