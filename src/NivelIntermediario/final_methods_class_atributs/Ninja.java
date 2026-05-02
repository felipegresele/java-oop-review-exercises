package NivelIntermediario.final_methods_class_atributs;

public class Ninja {

    //por padrao qualquer atributo da classe é public
    String nome;

    //O valor é definido aqui na inicialização do atributo
    final int idade = 40;

    final void mostrarIdade() {
        System.out.println("Minha idade é " + idade + " anos");
    }


}
