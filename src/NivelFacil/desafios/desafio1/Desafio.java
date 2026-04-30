package NivelFacil.desafios.desafio1;

public class Desafio {
    public static void main(String[] args) {
        String nome = "ninja1";
        int idade = 18;
        String nomeMissao = "nao sei 1";
        char nivelDificuldade = 'A';
        Status statusMissao = Status.PENDENTE;
        if (idade > 15) {
            if (nivelDificuldade == 'C' || nivelDificuldade == 'D') {
                statusMissao = Status.FINALIZADO;
            } else {
                statusMissao = Status.PENDENTE;
            }
        } else {
            statusMissao = Status.FINALIZADO;
        }

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(nomeMissao);
        System.out.println(nivelDificuldade);
        System.out.println(statusMissao);

        String nomeNinja2 = "ninja2";
        int idadeNinja2 = 14;
        String nomeMissaoNinja2 = "nao sei 2";
        char nivelDificuldadeNinja2 = 'A';
        Status statusMissaoNinja2 = Status.FINALIZADO;

        if (idadeNinja2 > 15) {
            if (nivelDificuldadeNinja2 == 'C' || nivelDificuldadeNinja2 == 'D') {
                statusMissaoNinja2 = Status.FINALIZADO;
            } else {
                statusMissaoNinja2 = Status.PENDENTE;
            }
        } else {
            statusMissaoNinja2 = Status.FINALIZADO;
        }

        System.out.println("=======================");
        System.out.println(nomeNinja2);
        System.out.println(idadeNinja2);
        System.out.println(nomeMissaoNinja2);
        System.out.println(nivelDificuldadeNinja2);
        System.out.println(statusMissaoNinja2);

        String nomeNinja3 = "ninja3";
        int idadeNinja3 = 18;
        String nomeMissaoNinja3 = "nao sei 3";
        char nivelDificuldadeNinja3 = 'D';
        Status statusMissaoNinja3 = Status.ANDAMENTO;

        if (idadeNinja3 > 15) {
            if (nivelDificuldadeNinja3 == 'C' || nivelDificuldadeNinja3 == 'D') {
                statusMissaoNinja3 = Status.FINALIZADO;
            } else {
                statusMissaoNinja3 = Status.PENDENTE;
            }
        } else {
            statusMissaoNinja3 = Status.FINALIZADO;
        }

        System.out.println("=======================");
        System.out.println(nomeNinja3);
        System.out.println(idadeNinja3);
        System.out.println(nomeMissaoNinja3);
        System.out.println(nivelDificuldadeNinja3);
        System.out.println(statusMissaoNinja3);

    }
}
