package br.com.renatodamazio.crud_api_ci_cd.api.dto;

public record CustomerDto(
        Long id,
        String name,
        String document,
        String email,
        boolean active
) { }
