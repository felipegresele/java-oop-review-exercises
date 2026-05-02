package NivelIntermediario.encapsulamento.getters_e_setters;

public class Ninja {

    private String nome;
    private int idade;

    public Ninja() {

    }

    public Ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Criando getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
