package br.com.first.funcionario.first.funcionario.domain;

import br.com.first.funcionario.first.funcionario.application.api.FuncionarioRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
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
}
