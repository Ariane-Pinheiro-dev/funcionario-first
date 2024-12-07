package br.com.funcionario.service;

import br.com.funcionario.api.*;
import br.com.funcionario.domain.Funcionario;
import br.com.funcionario.infra.FuncionarioInfraRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {

    private final FuncionarioInfraRepository funcionarioRepository;

    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FuncionarioService.criaFuncionario");
        Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
        log.info("[finaliza] FuncionarioService.criaFuncionario");
        return FuncionarioResponse.builder().idFuncionario(funcionario.getIdFuncionario()).build();
    }

    @Override
    public List<FuncionarioListResponse> buscaTodosFuncionarios() {
        log.info("[inicia] FuncionarioService.buscaTodosFuncionarios");
        List<Funcionario> funcionarios = funcionarioRepository.buscaTodosFuncionarios();
        log.info("[finaliza] FuncionarioService.buscaTodosFuncionarios");
        return FuncionarioListResponse.converte(funcionarios);
    }

    @Override
    public FuncionarioDetalhadoResponse buscaFuncionarioAtravezID(UUID idFuncionario) {
        log.info("[inicia] FuncionarioService.buscaFuncionarioAtravesId");
        Funcionario funcionario = funcionarioRepository.buscaFuncionarioAtravesId(idFuncionario);
        log.info("[finaliza] FuncionarioService.buscaFuncionarioAtravesId");
        return new FuncionarioDetalhadoResponse(funcionario);
    }

    @Override
    public void deletaFuncionarioAtravezID(UUID idFuncionario) {
        log.info("[inicia] FuncionarioService.deletaFuncionarioAtravezID");
        Funcionario funcionario = funcionarioRepository.buscaFuncionarioAtravesId(idFuncionario);
        funcionarioRepository.deletaFuncionario(funcionario);
        log.info("[finaliza] FuncionarioService.deletaFuncionarioAtravezID");
    }

    @Override
    public void patchAlteraFuncionario(UUID idFuncionario, FuncionarioAlteracaoRequest funcionarioAlteracaoRequest) {
        log.info("[inicia] FuncionarioController - patchAlteraFuncionario");
        Funcionario funcionario = funcionarioRepository.buscaFuncionarioAtravesId(idFuncionario);
        funcionario.altera(funcionarioAlteracaoRequest);
        funcionarioRepository.salva(funcionario);
        log.info("[finaliza] FuncionarioController - patchAlteraFuncionario");
    }
}