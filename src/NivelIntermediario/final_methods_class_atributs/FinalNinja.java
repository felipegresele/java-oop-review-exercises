package NivelIntermediario.final_methods_class_atributs;

//Uma classe final é uma classe normal mas nao pode ser herdade
//Fora isso é uma classe normal e atributos e metódos podem ser de qualquer tipo
final public class FinalNinja {

    String nome;
    int idade;

    void saudacoes() {
        System.out.println(nome + " tem " + idade + " anos");
    }
}
