package NivelIntermediario.classes_abstratas;

//classes abstratas não podem ser instaciadas
//É como se fosse uma classe molde que não pode mexer, adicionar e nem remover nos seus atributos/metodos
public abstract class Ninja {

    String nome;
    int idade;
    String aldeia;
    String habilidade;

    //Metódos abstratos não podem ter corpo
    public abstract void mostrarInformacoes();

    public abstract void executarHabilidade();

    //pode ser chamado na instacia da sua classe filha
    public void saudacoes() {
        System.out.println("Prazer, eu sou o ninja " + nome);
    }
}
