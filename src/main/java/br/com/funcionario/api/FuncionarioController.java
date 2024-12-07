package br.com.funcionario.api;

import br.com.funcionario.domain.Funcionario;
import br.com.funcionario.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor

public class FuncionarioController implements FuncionarioAPI {
    private final FuncionarioService funcionarioService;

    @Override
    public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FucionarioController - postFuncionario");
        FuncionarioResponse funcionarioCriado = funcionarioService.criaFuncionario(funcionarioRequest);
        log.info("[finaliza] FucionarioController - postFuncionario");
        return funcionarioCriado;
    }

    @Override
    public List<FuncionarioListResponse> getTodosFuncionarios() {
        log.info("[inicia] FuncionarioController - getTodosFuncionarios");
        List<FuncionarioListResponse> funcionarios = funcionarioService.buscaTodosFuncionarios();
        log.info("[finaliza] FuncionarioController - getTodosFuncionarios");
        return funcionarios;
    }

    @Override
    public FuncionarioDetalhadoResponse getFuncionarioAtravesId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioController - getFuncionarioAtravesId");
        log.info("[idFuncionario] {}", idFuncionario);
        FuncionarioDetalhadoResponse funcionarioDetalhado = funcionarioService.buscaFuncionarioAtravezID(idFuncionario);
        log.info("[finaliza] FuncionarioController - getFuncionarioAtravesId");
        return funcionarioDetalhado;
    }

    @Override
    public void deletaFuncionarioAtravesId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioController - deletaFuncionarioAtravesId");
        log.info("[idFuncionario] {}", idFuncionario);
        funcionarioService.deletaFuncionarioAtravezID(idFuncionario);
        log.info("[finaliza] FuncionarioController - deletaFuncionarioAtravesId");

    }

    @Override
    public void patchAlteraFuncionario(UUID idFuncionario, FuncionarioAlteracaoRequest funcionarioAlteracaoRequest) {
        log.info("[inicia] FuncionarioController - patchAlteraFuncionario");
        log.info("[idFuncionario] {}", idFuncionario);
        funcionarioService.patchAlteraFuncionario(idFuncionario,funcionarioAlteracaoRequest);
        log.info("[finaliza] FuncionarioController - patchAlteraFuncionario");
    }

}
