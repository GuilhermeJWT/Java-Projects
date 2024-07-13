package models;

public class PessoaConvertida {

    private Integer idadeConvertida;
    private String nomeConvertido;
    private String salarioConvertido;

    public Integer getIdadeConvertida() {
        return idadeConvertida;
    }

    public void setIdadeConvertida(Integer idadeConvertida) {
        this.idadeConvertida = idadeConvertida;
    }

    public String getNomeConvertido() {
        return nomeConvertido;
    }

    public void setNomeConvertido(String nomeConvertido) {
        this.nomeConvertido = nomeConvertido;
    }

    public String getSalarioConvertido() {
        return salarioConvertido;
    }

    public void setSalarioConvertido(String salarioConvertido) {
        this.salarioConvertido = salarioConvertido;
    }

    public PessoaConvertida(){

    }

    public PessoaConvertida(Integer idadeConvertida, String nomeConvertido, String salarioConvertido) {
        this.idadeConvertida = idadeConvertida;
        this.nomeConvertido = nomeConvertido;
        this.salarioConvertido = salarioConvertido;
    }
}
