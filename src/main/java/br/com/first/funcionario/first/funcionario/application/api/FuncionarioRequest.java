package br.com.first.funcionario.first.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class FuncionarioRequest {
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String cargo;
    private double salário;
    @NotBlank
    private String telefone;
    private String endereco;
    @NotNull
    private Boolean aceitaTermos;
}
