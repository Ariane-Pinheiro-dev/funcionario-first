package br.com.funcionario.infra;

import br.com.funcionario.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface FuncionarioSpringDataJPARepository extends JpaRepository<Funcionario, UUID> {
}
