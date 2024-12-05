package br.com.funcionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class FuncionarioFirstApplication {

    @GetMapping
    public String getHomeTeste() {
        return "Funcionario First - API Home";

    }

    public static void main(String[] args) {
        SpringApplication.run(FuncionarioFirstApplication.class, args);
    }

}
