package NivelIntermediario.classes_abstratas.desafio;

import NivelIntermediario.desafios.desafio2.TipoHabilidade;

//Essa classe filha so pode ter uma classe mãe
public class NinjaCinza extends Ninja{

    //Por mais que eu esteja extendendo a classe Ninja
    //O java não sabe que eu quero q esse construtor se referencie com o construtor da classe mae (Super Classe)
    //Para isso deve usar a palavra super()
    //To pegando as referências do construtor vazio de super classe
    public NinjaCinza() {
        super();
    }

    public NinjaCinza(String nome, int idade, String habilidade, String superHabilidade, TipoHabilidade tipoHabilidade) {
        super(nome, idade, habilidade, superHabilidade, tipoHabilidade);
    }

}
