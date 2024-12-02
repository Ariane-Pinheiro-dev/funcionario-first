package br.com.first.funcionario.first.infra;

import br.com.first.funcionario.first.funcionario.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FuncionarioSpringDataJPARepository extends JpaRepository<Funcionario, UUID> {

}
