package NivelIntermediario.classes_abstratas.desafio;

import NivelIntermediario.desafios.desafio2.TipoHabilidade;

public class Main {

    public static void main(String[] args) {

        NinjaCinza ninjaDoVento = new NinjaCinza("Ninja do vento", 20, "Ventos fortes", "Criar furacão", TipoHabilidade.RINNENGAN);

        ninjaDoVento.apresentacao();
        ninjaDoVento.mostrarHabilidades();

        NinjaCinza ninjaDaTerra = new NinjaCinza("Ninja da terra", 22, "Terra tremer", "Abrir buracos no chão", TipoHabilidade.GENJUTSU);

        ninjaDaTerra.apresentacao();
        ninjaDaTerra.mostrarHabilidades();

    }
}
