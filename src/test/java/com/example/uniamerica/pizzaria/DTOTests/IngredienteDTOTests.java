package com.example.uniamerica.pizzaria.DTOTests;

import com.example.uniamerica.pizzaria.DTO.IngredienteDTO;
import com.example.uniamerica.pizzaria.DTO.SaborDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class IngredienteDTOTests {
    private IngredienteDTO ingredienteDTO = new IngredienteDTO();
    private List<SaborDTO> sabores = new ArrayList<>();
    @BeforeEach
    void setup() {
        sabores.add(new SaborDTO());
        ingredienteDTO.setId(1L);
        ingredienteDTO.setNome("Ingrediente A");
        ingredienteDTO.setQuantidade(10);
        ingredienteDTO.setSabores(sabores);
    }

    @Test
    void ingredienteIdTest(){
        assertEquals(1L, ingredienteDTO.getId());
    }
    @Test
    void ingredienteNomeTest(){
        assertEquals(1L, ingredienteDTO.getId());
    }
    @Test
    void ingredienteQuantidadeTest(){
        assertEquals(1L, ingredienteDTO.getId());
    }
    @Test
    void ingredienteSaboresTest(){
        assertEquals(1L, ingredienteDTO.getId());
    }
    @Test
    void ingredienteAllArgsConstructorTest(){
        IngredienteDTO tamanhoAllArgs = new IngredienteDTO("Ingrediente A", 10, sabores);
        assertThat(ingredienteDTO).usingRecursiveComparison().ignoringFields("id").isEqualTo(tamanhoAllArgs);
    }

}
