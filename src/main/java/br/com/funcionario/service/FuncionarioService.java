package br.com.funcionario.service;

import br.com.funcionario.api.FuncionarioDetalhadoResponse;
import br.com.funcionario.api.FuncionarioListResponse;
import br.com.funcionario.api.FuncionarioRequest;
import br.com.funcionario.api.FuncionarioResponse;

import java.util.List;
import java.util.UUID;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
    List<FuncionarioListResponse> buscaTodosFuncionarios();
    FuncionarioDetalhadoResponse buscaFuncionarioAtravezID(UUID idFuncionario);
}
