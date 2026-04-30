package NivelIntermediario.desafios.desafio2;

public class Main {

    public static void main(String[] args) {
        NinjaBasico ninjaBasico = new NinjaBasico("ninja basico", 18, "soltar fogo com as mãos", TipoHabilidade.GENJUTSU);

        System.out.println(ninjaBasico.habilidade);

        NinjaAvancado ninjaAvancado = new NinjaAvancado(
                "Ninja avançado",
                20,
                "Soltar tornado com mãos",
                "Fazer 5 tornados por minuto",
                TipoHabilidade.KATON);

        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidade();

        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();
    }

}
