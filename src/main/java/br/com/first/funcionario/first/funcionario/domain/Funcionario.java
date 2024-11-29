package br.com.first.funcionario.first.funcionario.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

    public Funcionario(UUID idFuncionario, String nomeCompleto, String cargo, double salário,
                       String telefone, String endereco, @NotNull Boolean aceitaTermos) {
        this.idFuncionario = UUID.randomUUID();
        this.idFuncionario = idFuncionario;
        this.nomeCompleto = nomeCompleto;
        this.cargo = cargo;
        this.salário = salário;
        this.telefone = telefone;
        this.endereco = endereco;
        this.aceitaTermos = aceitaTermos;
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}
