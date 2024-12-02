package br.com.first.funcionario.first.service;

import br.com.first.funcionario.first.funcionario.application.api.FuncionarioRequest;
import br.com.first.funcionario.first.funcionario.application.api.FuncionarioResponse;
import br.com.first.funcionario.first.funcionario.domain.Funcionario;
import br.com.first.funcionario.first.repository.funcionarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
    private final br.com.first.funcionario.first.repository.funcionarioRepository funcionarioRepository;

    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FuncionarioService.criaFuncionario");
        funcinarioLogger.logNovoFuncionario(funcionarioRequest);
        Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
        funcionarioTopicoProducer.notificaNovoFucionario(funcionario);
        log.info("[finaliza] FuncionarioService.criaFuncionario");
        return FuncionarioResponse.builder().idFuncionario(funcionario.getIdFuncionario()).build();
    }
}
