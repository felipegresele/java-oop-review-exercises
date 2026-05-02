package NivelIntermediario.records;

public record CadastroUsuario(String nomeUsuario, int id) {

    //Todos os atributos do record são private e nao tem setter para mudar
    //Ideal usar Record para classes que os atributos são imutaveis

    //Cria getters apenas com o nome do atributo

    //So tem construtor cheio

    //Ja vem com toString() sobrescrito automatico

}
