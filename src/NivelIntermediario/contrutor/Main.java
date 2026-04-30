package NivelIntermediario.contrutor;


public class Main {

    public static void main(String[] args) {

        NinjaAgua ninjaAgua1 = new NinjaAgua();
        ninjaAgua1.nome = "Ninja 1";

        System.out.println(ninjaAgua1.nome);

        NinjaAgua ninjaAgua2 = new NinjaAgua("Ninja2");
        System.out.println(ninjaAgua2.nome);

        NinjaAgua ninjaAgua3 = new NinjaAgua("Ninja 3", 18, true);
        System.out.println(ninjaAgua3.nome + " - " + ninjaAgua3.idade + " - " + ninjaAgua3.vivoOuNao);

    }
}
