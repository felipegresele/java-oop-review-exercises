package NivelIntermediario.contrutor;

public class NinjaAgua {

    String nome;
    int idade;
    boolean vivoOuNao;

    //Existem dois tipos de construtores
    //No Args Constructor e All Args Constructor

    //No Args Constructor - Construtor vazio não recebe parametros
    public NinjaAgua() {

    }

    //Pratica nao muito usada
    //Construtor com so 1 parametro
    public NinjaAgua(String nome) {
        this.nome = nome;
    }

    //All args Constructor - Construtor com todos os atributos da classe
    //Quando eu instaciar ele em outra classe devera passar todos os parametros que pede da classe
    public NinjaAgua(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

}
