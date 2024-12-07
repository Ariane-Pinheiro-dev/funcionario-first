package br.com.funcionario.api;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class FuncionarioResponse {
        private UUID idFuncionario;

    }
