package NivelIntermediario.desafios.desafio2;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String especialidade;
    TipoHabilidade tipoHabilidade;

    @Override
    public void executarHabilidade() {
        System.out.println("Executei a habilidade de " + habilidade + " do tipo " + tipoHabilidade );
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Eu sou "
                + nome + ", minha idade é: "
                + idade + ", tenho habilidade de "
                + habilidade + ", especialidade é "
                + especialidade + " do tipo " + tipoHabilidade);
    }

    //Construtor vazio
    public NinjaAvancado() {

    }

    //Construtor cheio
    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.tipoHabilidade = tipoHabilidade;
    }


}
