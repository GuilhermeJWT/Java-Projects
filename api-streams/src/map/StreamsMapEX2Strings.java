package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapEX2Strings {

    public static void main(String[] args) {

        List<String> listString = Arrays.asList("Guilherme", "Santos", "Java", "Streams");

        System.out.println("----------------------------Exemplo 1------------------------------------------");

        /*Transforma todas as letras em Maiusculo = [GUILHERME, SANTOS, JAVA, STREAMS]*/
        List<String> upString = listString.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upString);

        System.out.println("----------------------------Exemplo 2------------------------------------------");
        /*Conta a quantidade de caracteres de cada palavra da lista = 9, 6, 4, 7*/
        listString.stream().map(caracteres -> caracteres.length()).forEach(System.out::println);

    }

}
