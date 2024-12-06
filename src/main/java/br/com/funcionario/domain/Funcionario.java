package br.com.funcionario.domain;

import br.com.funcionario.api.FuncionarioAlteracaoRequest;
import br.com.funcionario.api.FuncionarioRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
    private UUID idFuncionario;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String cargo;
    private double salário;
    @NotBlank
    private String telefone;
    private String endereco;
    @NotNull
    private Boolean aceitaTermos;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    public Funcionario(FuncionarioRequest funcionarioRequest) {
        this.nomeCompleto = funcionarioRequest.getNomeCompleto();
        this.cargo = funcionarioRequest.getCargo();
        this.salário = funcionarioRequest.getSalário();
        this.telefone = funcionarioRequest.getTelefone();
        this.endereco = funcionarioRequest.getEndereco();
        this.aceitaTermos = funcionarioRequest.getAceitaTermos();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }

    public void altera(FuncionarioAlteracaoRequest funcionarioRequest){
        this.nomeCompleto = funcionarioRequest.getNomeCompleto();
        this.telefone = funcionarioRequest.getTelefone();
        this.endereco = funcionarioRequest.getEndereco();

    }
}
