package NivelIntermediario.overload_sobrecarga_de_contrutores;

public abstract class Ninja {

    //TODO: adicionar novos atributos a classe - quantidadeDeMissoesConcluidas e Rank

    String nome;
    int idade;
    String aldeia;
    int quantidadeDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {

    }

    //O errado é passar esses atributos novos no construtor que ja existe
    // todas as classes filhas que usam ou instancia dessa classe vao quebrar e tem que passar os novos atributos
    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //Essa forma tambem nao é a melhor pois polui muito o codigo com "duplicação"
    /*
    * public Ninja(String nome, int idade, String aldeia, String quantidadeDeMissoesConcluidas, NivelNinja rank) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.quantidadeDeMissoesConcluidas = quantidadeDeMissoesConcluidas;
        this.rank = rank;
    }
    * */

    //Forma certa de criar um construtor com os atributos novos

    //TODO: Sobrecarga de construtor para os novos atributos
    //Assim se faz a sobrecarga dos construtores
    public Ninja(String nome, int idade, String aldeia, int quantidadeDeMissoesConcluidas, NivelNinja rank) {
        this(nome, idade, aldeia);
        this.quantidadeDeMissoesConcluidas = quantidadeDeMissoesConcluidas;
        this.rank = rank;
    }

    //Metódos abstract não tem corpo, o corpo deve ser criado na classe filha
    public abstract void saudacoes();

    public abstract void saudacoesAtualizada();

}
