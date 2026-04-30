package NivelIntermediario;

public class Ninja {
    public String nome;
    public String aldeia;
    public int idade;

    //Criando metódo publico
    //Metódo void não tem retorno
    public void ativarPoder() {
        System.out.println("O poder ativou!");
    }

    public String boasVindas() {
        return "Oi eu sou um ninja";
    }

    public int anosParaSeTornarMestre(int idadeMinima) {
        return idadeMinima - idade;
    }
}
