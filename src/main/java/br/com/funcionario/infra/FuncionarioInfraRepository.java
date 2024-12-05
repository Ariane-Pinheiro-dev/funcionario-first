package br.com.funcionario.infra;

import br.com.funcionario.domain.Funcionario;
import br.com.funcionario.repository.funcionarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements funcionarioRepository {
    private final FuncionarioSpringDataJPARepository funcionarioSpringDataJPARepository;
    private Funcionario funcionario;

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
        List<Funcionario> todosFuncionarios = funcionarioSpringDataJPARepository.findAll();
        log.info("[finaliza] FuncionarioInfraRepository - buscaTodosFuncionarios");
        return todosFuncionarios;
    }

    @Override
    public Funcionario buscaFuncionarioAtravesId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioInfraRepository - buscaFuncionarioAtravesId");
        Funcionario funcionario = funcionarioSpringDataJPARepository.findById(idFuncionario)
                .orElseThrow(() -> new RuntimeException("Funcionario não encontrado!"));
        log.info("[finaliza] FuncionarioInfraRepository - buscaFuncionarioAtravesId");
        return funcionario;
    }
}