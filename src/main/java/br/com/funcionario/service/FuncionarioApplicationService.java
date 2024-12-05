package br.com.funcionario.service;

import br.com.funcionario.api.FuncionarioListResponse;
import br.com.funcionario.api.FuncionarioRequest;
import br.com.funcionario.api.FuncionarioResponse;
import br.com.funcionario.domain.Funcionario;
import br.com.funcionario.infra.FuncionarioInfraRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
