package com.example.uniamerica.pizzaria.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter @Setter
public class AbstractEntityDTO {
    @NotNull
    private Long id;

    private LocalDateTime cadastro;

    private LocalDateTime edicao;

    private LocalDateTime delecao;

}