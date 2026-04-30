package NivelFacil.condicoes;

public class Ternarios {

    public static void main(String[] args) {
        /*
        * Ternarios: maneira de reduzir o codigo
        * Estrutura: (condicao) ? valorSeForVerdadeiro : valorSeForFalso
        * */

        int numeroMissoes = 10;

        String nivel = numeroMissoes <= 5 ? "iniciante" : "intermediário";
        System.out.println("Nível do Ninja é: " + nivel);
    }
}
