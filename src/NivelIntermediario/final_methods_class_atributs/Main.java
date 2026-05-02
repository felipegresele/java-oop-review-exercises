package NivelIntermediario.final_methods_class_atributs;

public class Main {

    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        ninja.nome = "Felipe";

        //Da erro se tentar mudar o valor
        //final deixa o valor do atributo/metodo é imutavel

        //ninja.idade = 15;
        ninja.mostrarIdade();

        FinalNinja finalNinja = new FinalNinja();
        finalNinja.nome = "ninja final";
        finalNinja.idade = 95;
        finalNinja.saudacoes();

    }

}
