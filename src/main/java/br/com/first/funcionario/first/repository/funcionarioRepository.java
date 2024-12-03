package br.com.first.funcionario.first.repository;

import br.com.first.funcionario.first.funcionario.domain.Funcionario;

import java.util.List;

public interface funcionarioRepository {
    Funcionario salva(Funcionario funcionario);
    List<Funcionario> buscaTodosFuncionarios();
}
