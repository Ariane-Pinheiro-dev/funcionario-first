package br.com.funcionario;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;


    @OpenAPIDefinition(info = @Info(title = "API Funcionário First", version = "v1"))
    @Configuration
    public class SwaggerConfig {

        @PostConstruct
        public void init() {
            System.out.println("Swagger configurado corretamente!"); }
    }

