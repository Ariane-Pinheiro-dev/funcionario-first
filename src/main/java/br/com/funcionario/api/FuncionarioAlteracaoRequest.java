package br.com.funcionario.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class FuncionarioAlteracaoRequest {
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String telefone;
    private String endereco;

}
