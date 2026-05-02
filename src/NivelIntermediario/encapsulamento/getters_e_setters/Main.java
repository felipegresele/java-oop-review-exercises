package NivelIntermediario.encapsulamento.getters_e_setters;

public class Main {

    public static void main(String[] args) {

        Ninja ninja = new Ninja("Felipe", 21);
        System.out.println("Nome " + ninja.getNome() + " Idade " + ninja.getIdade() + " anos" );
        //Setando novo valor para nome
        //Agora o getter vai pegar o novo valor pois atualiza o valor do atributo direto do objeto (classe) Ninja
        ninja.setNome("Joao");
        System.out.println("Nome " + ninja.getNome() + " Idade " + ninja.getIdade() + " anos" );

    }
}
