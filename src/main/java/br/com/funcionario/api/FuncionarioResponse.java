package br.com.funcionario.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class FuncionarioResponse {
        private UUID idFuncionario;

    }
