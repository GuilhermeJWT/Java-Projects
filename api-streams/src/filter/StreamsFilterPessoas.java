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
                new Pessoa(15, "Streams", new BigDecimal(750))
        );

        /*Encontrando um objeto dentro de uma lista: A api do stream possui um método findAny() que pode ser combinado com o filter():*/
        Optional<Pessoa> pessoaFiltrada = pessoas.stream().filter(i -> i.getIdade() < 20).findAny();

        System.out.println(pessoaFiltrada); /*Resultado: Optional[Pessoa{idade=15, nome='Streams', salario=750}]*/

    }
}
