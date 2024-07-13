package map;

import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsMapEX1Integer {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 9, 15, 19);

        System.out.println("----------------------------Exemplo 1------------------------------------------");

        /*Multiplica todos os números da lista por 3 = 3, 15, 27, 45, 57*/
        list.stream().map(numeros -> numeros * 3).forEach(System.out::println);

        System.out.println("----------------------------Exemplo 2------------------------------------------");

        String stringUnica = list.stream()
                .map(String::valueOf) // Transforma cada item em STRING
                .collect(Collectors.joining("-")); // Junta todas as Strings em uma única, separada por '-'

        System.out.println(stringUnica); /*Resultado: 1-5-9-15-19*/
    }

}
