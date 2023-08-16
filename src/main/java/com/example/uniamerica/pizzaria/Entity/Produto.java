package com.example.uniamerica.pizzaria.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jdk.dynalink.linker.LinkerServices;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Entity
@Table (name="produtos", schema = "public")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(name="id", unique = true)
    private Long id;

    @Getter @Setter @NotNull(message = "O nome deve ser informado!")
    @Length(min = 3, max = 20, message = "O nome deve ter no mínimo 3 e no máximo 20 caracteres")
    @Column(name="nome", nullable = false, length = 20)
    private String nome;

    @Getter @Setter @NotNull(message = "A quantidade deve ser informada!")
    @Column(name="quantidade", nullable = false)
    private Integer quantidade;

    @Getter @Setter
    @Length(max = 50, message = "A descrição deve ter no máximo 50 caracteres")
    @Column(name = "descricao", length = 50)
    private String descricao;

    @Getter @Setter
    @ManyToMany(mappedBy = "produtos")
    private List<Pedido> pedidos;
}
