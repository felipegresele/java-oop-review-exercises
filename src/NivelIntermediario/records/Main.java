package NivelIntermediario.records;

public class Main {

    public static void main(String[] args) {

        CadastroUsuario usuario = new CadastroUsuario("felipe", 100);
        System.out.println("Nome: " + usuario.nomeUsuario() + ", ID: " + usuario.id());
        System.out.println(usuario + " Exibindo com toString() padrão do Record");

    }

}
