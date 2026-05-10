package NivelAvançado.escopo_static;

public class Main {

    String nomePessoa = "Felipe";
    static int idadePessoa = 17;

    public static void main(String[] args) {

        Ninja ninja = new Ninja();

        //Metódos não estaticos precisa instaciar a classe para conseguir acessar as varieaveis da classe
        ninja.sharigan();

        //Metódos estaticos não precisa instaciar a classe para conseguir acessar as varieaveis da classe
        //É so iniciar o objeto da classe e aparece direto as variaveis para acessar
        //Variaveis static só podem ser inicidades em metódos static
        Ninja.jogarShurikein();
        int idadePessoa = Main.idadePessoa;

        Main main = new Main();

        System.out.println(main.nomePessoa);

        main.metodoNaoEstatico();
        System.out.println();
        metodo();
    }

    public static void metodo() {
        int idade = idadePessoa;
        System.out.println("Idade Static: " + idade);
    }

    public void metodoNaoEstatico() {
        int idade = Main.idadePessoa;
        System.out.println("Idade: " + idade);
    }

}
