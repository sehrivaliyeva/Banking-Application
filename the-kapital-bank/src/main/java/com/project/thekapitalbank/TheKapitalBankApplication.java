package com.project.thekapitalbank;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "The Kapital Bank App",
                description = "Backend Rest APIs for Banking Application",
                contact = @Contact(
                        name = "Shahrigul Valiyeva",
                        email = "Shahrigul.valiyeva@yahoo.com",
                        url="https://github.com/sehrivaliyeva/BankingApplicationProject"
                )
        )
)
public class TheKapitalBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheKapitalBankApplication.class, args);
    }

}
