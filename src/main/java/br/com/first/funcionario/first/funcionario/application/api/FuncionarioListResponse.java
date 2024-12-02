package br.com.first.funcionario.first.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public class FuncionarioListResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String telefone;
}
