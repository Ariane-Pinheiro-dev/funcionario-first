package br.com.first.funcionario.first.service;

import br.com.first.funcionario.first.funcionario.application.api.FuncionarioListResponse;
import br.com.first.funcionario.first.funcionario.application.api.FuncionarioRequest;
import br.com.first.funcionario.first.funcionario.application.api.FuncionarioResponse;
import br.com.first.funcionario.first.funcionario.domain.Funcionario;
import br.com.first.funcionario.first.repository.funcionarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
    private final br.com.first.funcionario.first.repository.funcionarioRepository funcionarioRepository;

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
        log.info("[finaliza] FuncionarioService.buscaTodosFuncionarios");
        return null;
    }
}
