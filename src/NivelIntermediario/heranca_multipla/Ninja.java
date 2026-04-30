package NivelIntermediario.heranca_multipla;

public abstract class Ninja {

    String nome;
    int idade;
    String aldeia;

    public Ninja() {

    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //Metódos abstract não tem corpo, o corpo deve ser criado na classe filha
    public abstract void saudacoes();

}
