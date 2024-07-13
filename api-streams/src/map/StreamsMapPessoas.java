package map;

import models.Pessoa;
import models.PessoaConvertida;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapPessoas {

    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa(25, "Guilherme", new BigDecimal(1000)),
                new Pessoa(33, "Java", new BigDecimal(3500)),
                new Pessoa(15, "Streams", new BigDecimal(750))
        );

        List<PessoaConvertida> result = pessoas.stream().map(converter -> {
            PessoaConvertida pessoaConvertida = new PessoaConvertida();
            pessoaConvertida.setIdadeConvertida(converter.getIdade());
            pessoaConvertida.setNomeConvertido(converter.getNome());
            pessoaConvertida.setSalarioConvertido(String.valueOf(converter.getSalario()));

            return pessoaConvertida;
        }).collect(Collectors.toList());

        System.out.println(result);

    }
}
