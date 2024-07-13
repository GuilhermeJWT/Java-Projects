package map;

import java.util.List;
import java.util.*;

public class StreamsMapEX1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 9, 15, 19);

        /*Multiplica todos os números da lista por 3 = 3, 15, 27, 45, 57*/
        list.stream().map(numeros -> numeros * 3).forEach(System.out::println);
    }

}
