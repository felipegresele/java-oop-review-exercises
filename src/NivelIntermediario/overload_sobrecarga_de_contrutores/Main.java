package NivelIntermediario.overload_sobrecarga_de_contrutores;

public class Main {

    public static void main(String[] args) {

        //Construtor antigo
    NinjaDeAgua ninjaDeAgua = new NinjaDeAgua("ninja 1", 16, "Aldeia da folha");
    ninjaDeAgua.saudacoes();

    //TODO: Implementar novo ninja com novos atributos

        //Construtor novo
        NinjaDeAgua ninjaDeAgua2 = new NinjaDeAgua("ninja 2", 20, "Aldeia da pedra", 18, NivelNinja.MEDIO);
        ninjaDeAgua2.saudacoesAtualizada();
        //Ambos construtores ficam disponível para escolha

    }

}
