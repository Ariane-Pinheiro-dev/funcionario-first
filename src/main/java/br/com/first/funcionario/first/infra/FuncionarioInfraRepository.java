package br.com.first.funcionario.first.infra;

import br.com.first.funcionario.first.funcionario.domain.Funcionario;
import br.com.first.funcionario.first.repository.funcionarioRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class FuncionarioInfraRepository implements funcionarioRepository {

    @Override
    public Funcionario salva(Funcionario funcionario) {
        log.info("[inicia] FuncionarioInfraRepository - salva");
        funcionarioSpringDataJPARepository.save(funcionario);
        log.info("[finaliza] FuncionarioInfraRepository - salva");
        return funcionario;
    }
}