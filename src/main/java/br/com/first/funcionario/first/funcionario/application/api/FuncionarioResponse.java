package br.com.first.funcionario.first.funcionario.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class FuncionarioResponse {
        private UUID idFuncionario;

    }
