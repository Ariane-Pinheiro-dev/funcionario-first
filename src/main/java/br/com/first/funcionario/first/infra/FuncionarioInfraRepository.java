package br.com.first.funcionario.first.infra;

import br.com.first.funcionario.first.funcionario.domain.Funcionario;
import br.com.first.funcionario.first.repository.funcionarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements funcionarioRepository {
    private final FuncionarioSpringDataJPARepository funcionarioSpringDataJPARepository;

    @Override
    public Funcionario salva(Funcionario funcionario) {
        log.info("[inicia] FuncionarioInfraRepository - salva");
        funcionarioSpringDataJPARepository.save(funcionario);
        log.info("[finaliza] FuncionarioInfraRepository - salva");
        return funcionario;
    }

    @Override
    public List<Funcionario> buscaTodosFuncionarios() {
        log.info("[inicia] FuncionarioInfraRepository - buscaTodosFuncionarios");
        List<Funcionario>todosFuncionarios = funcionarioSpringDataJPARepository.findAll();
        log.info("[finaliza] FuncionarioInfraRepository - buscaTodosFuncionarios");
        return todosFuncionarios;
    }
}