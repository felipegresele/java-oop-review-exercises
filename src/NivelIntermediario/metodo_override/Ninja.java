package NivelIntermediario.metodo_override;

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

    public void jogarPoder() {
        System.out.println("O seu poder é de ninja, todo ninja é furtivo");
    }

}
