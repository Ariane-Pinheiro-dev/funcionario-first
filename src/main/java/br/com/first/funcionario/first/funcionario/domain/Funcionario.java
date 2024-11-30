package br.com.first.funcionario.first.funcionario.domain;

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

    public Funcionario(UUID idFuncionario, @NotBlank String nomeCompleto, @NotBlank String cargo, double salário,
                       @NotBlank String telefone, String endereco, @NotNull Boolean aceitaTermos) {
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
