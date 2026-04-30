package NivelFacil.condicoes;

public class IfeElse {

    public static void main(String[] args) {

        String nome = "Naruto";
        int idade = 10;
        boolean hokage = false;
        int numeroMissoes = 16;

        if (numeroMissoes <= 5) {
            System.out.println("Este ninja está no nivel 1");
        } else if (numeroMissoes <= 15) {
            System.out.println("Este ninja está no nivel 2");
        } else {
            System.out.println("Este ninja está no nivel 3");
            System.out.println("Este ninja agora é um hokage");
            hokage = true;
        }

        System.out.println("============================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ele é um hokage: " + hokage);
        System.out.println("Número Missoes: " + numeroMissoes);
    }



}
