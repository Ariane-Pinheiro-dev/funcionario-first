package br.com.first.funcionario.first.service;

import br.com.first.funcionario.first.funcionario.application.api.FuncionarioListResponse;
import br.com.first.funcionario.first.funcionario.application.api.FuncionarioRequest;
import br.com.first.funcionario.first.funcionario.application.api.FuncionarioResponse;

import java.util.List;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
    List<FuncionarioListResponse> buscaTodosFuncionarios();
}
