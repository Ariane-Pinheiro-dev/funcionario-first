package br.com.first.funcionario.first.funcionario.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class FuncionarioController implements FuncionarioAPI {

    @Override
    public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FucionarioController - postFuncionario");
        log.info("[finaliza] FucionarioController - postFuncionario");
        return null;
    }
}
