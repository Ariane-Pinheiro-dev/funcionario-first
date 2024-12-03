package br.com.first.funcionario.first.funcionario.application.api;

import br.com.first.funcionario.first.funcionario.domain.Funcionario;
import jakarta.validation.constraints.NotBlank;

import java.util.List;
import java.util.UUID;

public class FuncionarioListResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String telefone;


    public static List<FuncionarioListResponse> convert(List<Funcionario> funcionarios) {
        return null;
    }
}
