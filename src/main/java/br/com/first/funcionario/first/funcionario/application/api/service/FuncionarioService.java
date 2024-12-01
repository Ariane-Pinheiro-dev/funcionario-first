package br.com.first.funcionario.first.funcionario.application.api.service;

import br.com.first.funcionario.first.funcionario.application.api.FuncionarioRequest;
import br.com.first.funcionario.first.funcionario.application.api.FuncionarioResponse;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
}
