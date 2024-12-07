package br.com.funcionario.api;

import br.com.funcionario.domain.Funcionario;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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

    public FuncionarioDetalhadoResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nomeCompleto = funcionario.getNomeCompleto();
        this.telefone = funcionario.getTelefone();
        this.aceitaTermos = funcionario.getAceitaTermos();
        this.dataHoraDoCadastro = funcionario.getDataHoraDoCadastro();
    }
}
