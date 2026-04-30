package NivelIntermediario.desafios.desafio2;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    @Override
    public void executarHabilidade() {
        System.out.println("Executei a habilidade de " + habilidade + " do tipo " + tipoHabilidade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Eu sou " + nome + ", minha idade é: " + idade + ", e tenho habilidade de " + habilidade + " do tipo " + tipoHabilidade);
    }

    //Construtor vazio
    public NinjaBasico() {

    }

    //Construtor cheio
    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }
}
