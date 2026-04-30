package NivelIntermediario.classes_abstratas.desafio;

import NivelIntermediario.desafios.desafio2.TipoHabilidade;

//Essa classe mãe pode ter infinitas sub classes
public abstract class Ninja implements NinjaInterface {

    String nome;
    int idade;
    String habilidade;
    String superHabilidade;
    TipoHabilidade tipoHabilidade;

    public Ninja() {

    }

    public Ninja(String nome, int idade, String habilidade, String superHabilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.superHabilidade = superHabilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    @Override
    public void mostrarHabilidades() {
        System.out.println("Eu sou " + nome + ", minha idade é: " + idade + ", e tenho habilidade de fazer " + habilidade + " e Super Habilidade é " + superHabilidade);
    }

    @Override
    public void apresentacao() {
        System.out.println("Eu sou " + nome + ", Ninja do " + tipoHabilidade);
    }

}
