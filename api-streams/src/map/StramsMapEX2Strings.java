package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StramsMapEX2Strings {

    public static void main(String[] args) {

        List<String> listString = Arrays.asList("Guilherme", "Santos", "Java", "Streams");

        /*Transforma todas as letras em Maiusculo = [GUILHERME, SANTOS, JAVA, STREAMS]*/
        List<String> upString = listString.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upString);
    }

}
