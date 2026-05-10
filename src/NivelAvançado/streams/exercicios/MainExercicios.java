package NivelAvançado.streams.exercicios;

import java.util.List;

public class MainExercicios {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(1,2,3,4,5);

        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        List<String> nomes = List.of("Felipe", "José", "Pedro");
        List<String> nomesTransformados = nomes.stream().map(nome -> nome.toUpperCase()).toList();
        System.out.println(nomesTransformados);

        List<String> palavras = List.of("Java ","", "Spring  " + "Java e Spring");
        palavras.stream().filter(p -> !p.isEmpty() && !p.equals(" ")).forEach(System.out::println);

        int somaResultado = numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Soma Total: " + somaResultado);

        int pegarMaiorNumero = numeros.stream().max((n1,n2) -> Integer.compare(n1,n2)).orElse(null);
        System.out.println("Maior número: " + pegarMaiorNumero);

    }
}
