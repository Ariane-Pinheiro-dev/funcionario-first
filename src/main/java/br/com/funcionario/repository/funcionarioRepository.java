package br.com.funcionario.repository;

import br.com.funcionario.domain.Funcionario;

import java.util.List;

public interface funcionarioRepository {
    Funcionario salva(Funcionario funcionario);
    List<Funcionario> buscaTodosFuncionarios();
}
