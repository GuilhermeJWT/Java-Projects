package models;

import java.math.BigDecimal;

public class Pessoa {

    private Integer idade;
    private String nome;
    private BigDecimal salario;

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Pessoa(){

    }

    public Pessoa(Integer idade, String nome, BigDecimal salario) {
        this.idade = idade;
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
