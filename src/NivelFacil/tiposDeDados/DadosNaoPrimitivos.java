package NivelFacil.tiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        //Dados não primitivos são dados que tem metodos prontos que podem ser acessados
        //Exemplos: String, Array. Class, Enum

        String nome = "Naruto";
        String aldeira = "Aldeira da folha";

        String nomeCaixaAlta = nome.toUpperCase();
        System.out.println("Nome normal: " + nome);
        System.out.println("Nome em caixa alta: " + nomeCaixaAlta);
    }
}
