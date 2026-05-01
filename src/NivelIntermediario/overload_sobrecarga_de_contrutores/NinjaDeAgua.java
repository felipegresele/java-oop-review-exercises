package NivelIntermediario.overload_sobrecarga_de_contrutores;

public class NinjaDeAgua extends Ninja implements InteligenciaInterface{

    public NinjaDeAgua() {
        super();
    }

    public NinjaDeAgua(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    //TODO: Sobrecarga de construtor com o novo construtor criado com os atributos novos - quantidadeDeMissoesConcluidas e Rank

    //Melhor forma de chamar o construtor atualizado
    //Desta forma não quebra algum lugar do codigo que esta usando essa classe com o construtor antigo
    public NinjaDeAgua(String nome, int idade, String aldeia, int quantidadeDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, quantidadeDeMissoesConcluidas, rank);
    }

    @Override
    public void saudacoes() {
        System.out.println("Olá, meu nome é " + nome
                + ", tenho " + idade + " anos"
                + " e sou da aldeia " + aldeia + ".");
    }

    @Override
    public void saudacoesAtualizada() {
        System.out.println("Olá, eu sou " + this.nome
                + ", tenho " + this.idade + " anos, "
                + "sou da aldeia " + this.aldeia
                + ", completei " + this.quantidadeDeMissoesConcluidas + " missões"
                + " e meu rank é " + this.rank + ".");
    }

    @Override
    public void mostrarInteligencia() {
        System.out.println("Eu sou " + nome + " minha inteligencia é SUPREMA");
    }

    @Override
    public void mostrarInteligencia(int qi) {
        if (qi >= 150) {
            System.out.println("Parabens voce é um GENIO");
        } else {
            System.out.println("Precisa treinar mais para evoluir");
        }

    }

}
