package NivelIntermediario.classes_abstratas.desafio;

import NivelIntermediario.desafios.desafio2.TipoHabilidade;

public class NinjaVerde extends Ninja{

    public NinjaVerde() {

    }

    public NinjaVerde(String nome, int idade, String habilidade, String superHabilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.superHabilidade = superHabilidade;
        this.tipoHabilidade = tipoHabilidade;
    }
}
