package br.com.renatodamazio.crud_api_ci_cd.api.controller;

import br.com.renatodamazio.crud_api_ci_cd.api.dto.CustomerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping
    public List<CustomerDto> getAll() {
        return List.of(
                new CustomerDto(1L, "Renato Damazio", "111.222.333-44", "renato@exemplo.com", true),
                new CustomerDto(2L, "Maria Silva", "555.666.777-88", "maria@exemplo.com", true),
                new CustomerDto(3L, "João Souza", "999.000.111-22", "joao@exemplo.com", false)
        );
    }
}
