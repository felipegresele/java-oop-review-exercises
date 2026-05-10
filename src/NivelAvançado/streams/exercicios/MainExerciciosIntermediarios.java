package NivelAvançado.streams.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainExerciciosIntermediarios {

    public static void main(String[] args) {
        List<Usuarios> usuarios = List.of(
                new Usuarios("Felipe", 20, "SP"),
                new Usuarios("Lucas", 17, "SP"),
                new Usuarios("Maria", 25, "RJ")
        );

        usuarios.stream().filter(usuario -> usuario.getIdade() >= 18).forEach(System.out::println);

        usuarios.stream().map(Usuarios::getNome).forEach(System.out::println);

        usuarios.stream()
                .sorted((usuario1, usuario2) -> Integer.compare(usuario1.getIdade(), usuario2.getIdade()))
                .forEach(System.out::println);

        List<Usuarios> usuariosFiltrados = usuarios.stream().filter(usuario -> usuario.getIdade() >= 18).toList();
        System.out.println("Quantidade usúarios com mais de 18 anos: " + usuariosFiltrados.size());

        //Retorna true ou false
        System.out.println(usuarios.stream().anyMatch(usuario -> usuario.getNome().contains("Felipe")));

        Map<String, List<Usuarios>> listaPorCidade = usuarios.stream().collect(Collectors.groupingBy(Usuarios::getCidade));
        System.out.println("Organizados por Cidade: " + listaPorCidade);


    }

}
