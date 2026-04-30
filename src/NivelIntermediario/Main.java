package NivelIntermediario;

import NivelIntermediario.heranca.NinjaAmarelo;

public class Main {

    public static void main(String[] args) {
        Ninja ninja = new Ninja();

        ninja.nome = "ninja 1";
        ninja.aldeia = "aldeia da folha";
        ninja.idade = 18;

        System.out.println(ninja.nome + " É da " + ninja.aldeia + " ,Idade: " + ninja.idade);

        //Aplicando metodos da minha classe
        ninja.ativarPoder();

        //O retorno precisa ser guardado em uma variavel
        String mensagemNinja = ninja.boasVindas();
        System.out.println(mensagemNinja);

        int quantosAnosFaltam = ninja.anosParaSeTornarMestre(30);
        System.out.println("Voce tem: " + ninja.idade + " anos, ainda falta no mínimo: " + quantosAnosFaltam);

        NinjaAmarelo ninjaAmarelo = new NinjaAmarelo();

        ninjaAmarelo.nome = "Ninja de Fogo";
        ninjaAmarelo.poderFogo();
        ninjaAmarelo.saudacoes();
    }

}
