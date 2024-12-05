package br.com.funcionario.repository;

import br.com.funcionario.domain.Funcionario;

import java.util.List;
import java.util.UUID;

public interface funcionarioRepository {
    Funcionario salva(Funcionario funcionario);
    List<Funcionario> buscaTodosFuncionarios();
    Funcionario buscaFuncionarioAtravesId(UUID idFuncionario);
}
