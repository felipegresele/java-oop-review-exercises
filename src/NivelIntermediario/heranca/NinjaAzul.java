package NivelIntermediario.heranca;

import NivelIntermediario.Ninja;

public class NinjaAzul extends Ninja {

    public void poderAgua() {
        System.out.println("Apenas ninjas amarelos tem poder de água");
    }

    public void saudacoes() {
        System.out.println("Eu sou " + nome);
    }
}
