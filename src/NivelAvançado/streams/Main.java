package NivelAvançado.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Ninja de Fogo", "Aldeia da Folha", 18));
        ninjas.add(new Ninja("Ninja da Névoa", "Aldeia da Névoa", 22));
        ninjas.add(new Ninja("Ninja do Trovão", "Aldeia da Nuvem", 25));
        ninjas.add(new Ninja("Ninja da Areia", "Aldeia da Areia", 19));
        ninjas.add(new Ninja("Ninja da Pedra", "Aldeia da Pedra", 30));
        ninjas.add(new Ninja("Ninja das Sombras", "Aldeia da Nuvem", 27));
        ninjas.add(new Ninja("Ninja do Vento", "Aldeia da Cachoeira", 21));
        ninjas.add(new Ninja("Ninja do Gelo", "Aldeia da Neve", 24));
        ninjas.add(new Ninja("Ninja da Lua", "Aldeia da Lua", 20));
        ninjas.add(new Ninja("Ninja do Dragão", "Aldeia do Som", 28));

        //TODO: FILTER

        //Filtrando ninjas com filter
        System.out.println("Filtrando por Ninjas da Aldeia da Nuvem");
        ninjas.stream().filter(n -> n.getAldeia().equals("Aldeia da Nuvem")).forEach(System.out::println);
        //Pode passar um ou mais parametros no filter
        System.out.println();
        System.out.println("Filtrando por Ninjas da Aldeia da Nuvem e Idade maior que 25");
        ninjas.stream().filter(n -> n.getAldeia().equals("Aldeia da Nuvem") && n.getIdade() > 25).forEach(System.out::println);

        //TODO: SORTED

        System.out.println();
        System.out.println("Ordenação por Idade");
        //Ordenação dos ninjas por idade
        ninjas.stream().sorted((n1,n2) -> Integer.compare(n1.getIdade(), n2.getIdade())).forEach(System.out::println);

        System.out.println();
        System.out.println("Ordenação por Nome");
        ninjas.stream().sorted((n1,n2) ->n1.getNome().compareTo(n2.getNome())).forEach(System.out::println);

        //TODO: MAP

        //Map é para mostrar e mapear um atributo
        System.out.println();
        System.out.println("Mapeando Ninjas por Nome");
        ninjas.stream().map(Ninja::getNome).forEach(System.out::println);

        //TODO: MAX
        //Filtrar por ninja mais velho
        //Compara dois e retorna o maior valor entre eles, retorna um Optional pois pode ou nao ter = null
        Ninja ninjaMaisVelho = ninjas.stream().max((n1,n2) -> Integer.compare(n1.getIdade(), n2.getIdade())).orElse(null);

        System.out.println("Ninja mais velho: " + ninjaMaisVelho);

        //TODO: MAX
        //Filtrar por ninja mais novo
        //Compara dois e retorna o menor valor entre eles, retorna um Optional pois pode ou nao ter = null
        Ninja ninjaMaisNovo = ninjas.stream().min((n1,n2) -> Integer.compare(n1.getIdade(), n2.getIdade())).orElse(null);

        System.out.println("Ninja mais novo: " + ninjaMaisNovo);
    }

}
