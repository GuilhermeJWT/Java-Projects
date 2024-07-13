package filter;

import models.Pessoa;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsFilterPessoas {

    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa(25, "Guilherme", new BigDecimal(1000)),
                new Pessoa(33, "Java", new BigDecimal(3500)),
                new Pessoa(15, "Streams", new BigDecimal(750)),
                new Pessoa(60, "Spring Boot", new BigDecimal(800)),
                new Pessoa(58, "JSF", new BigDecimal(950)),
                new Pessoa(21, "JSP", new BigDecimal(5000)),
                new Pessoa(99, "AWS", new BigDecimal(365)),
                new Pessoa(100, "Jenkins", new BigDecimal(1258))
        );

        /*Encontrando um objeto dentro de uma lista: A api do stream possui um método findAny() que pode ser combinado com o filter():*/
        Optional<Pessoa> pessoaFiltrada = pessoas.stream().filter(i -> i.getIdade() < 20).findAny();

        System.out.println(pessoaFiltrada); /*Resultado: Optional[Pessoa{idade=15, nome='Streams', salario=750}]*/
        System.out.println("-----------------------------------------------------------------------------");

         pessoas.stream()
                .skip(2) // ignora os 2 primeiros números
                .limit(5) // limita a 5 números
                .distinct() // ignora números iguais
                .forEach(System.out::println);
         /*Resultado:
         Pessoa{idade=15, nome='Streams', salario=750},
         Pessoa{idade=60, nome='Spring Boot', salario=800},
         Pessoa{idade=58, nome='JSF', salario=950},
         Pessoa{idade=21, nome='JSP', salario=5000},
         Pessoa{idade=99, nome='AWS', salario=365} */
    }
}
