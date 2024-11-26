package br.com.first.funcionario.first;

import java.util.UUID;

public class Funcionario {

    private UUID idFuncionario;
    private String nomeCompleto;
    private String cargo;
    private double salário;
    private String telefone;
    private String endereco;

    public Funcionario(String nomeCompleto, UUID idFuncionario, String cargo, double salário, String telefone, String endereco) {
        this.nomeCompleto = nomeCompleto;
        this.idFuncionario = UUID.randomUUID(); //Gera UUID automaticamente
        this.cargo = cargo;
        this.salário = salário;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public UUID getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(UUID idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalário() {
        return salário;
    }

    public void setSalário(double salário) {
        this.salário = salário;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
