package br.com.funcionario.api;

import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class FuncionarioDetalhadoResponse {

    private UUID idFuncionario;
    private String nomeCompleto;
    private String telefone;
    private Boolean aceitaTermos;
    private LocalDateTime dataHoraDoCadastro;
}
