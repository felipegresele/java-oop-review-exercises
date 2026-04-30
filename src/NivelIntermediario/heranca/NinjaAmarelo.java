package NivelIntermediario.heranca;

import NivelIntermediario.Ninja;

//herda e tem acesso a todos os atributos nome, idade e aldeia da classe mãe (Ninja)
public class NinjaAmarelo extends Ninja {

    public void poderFogo() {
        System.out.println("Apenas ninjas amarelos tem poder de fogo");
    }

    public void saudacoes() {
        System.out.println("Eu sou " + nome);
    }

}
