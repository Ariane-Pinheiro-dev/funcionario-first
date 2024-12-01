package br.com.first.funcionario.first.service;

import br.com.first.funcionario.first.funcionario.application.api.FuncionarioRequest;
import br.com.first.funcionario.first.funcionario.application.api.FuncionarioResponse;
import br.com.first.funcionario.first.funcionario.domain.Funcionario;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class FuncionarioApplicationService implements FuncionarioService {

    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FuncionarioService.criaFuncionario");
        Funcionario funcionario = funcionario.salva(new Funcionario(funcionarioRequest));
        log.info("[finaliza] FuncionarioService.criaFuncionario");
        return null;
    }
}
