package br.com.renatodamazio.crud_api_ci_cd.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
                "status", "up",
                "swagger", "/swagger",
                "health", "/actuator/health"
        );
    }
}
