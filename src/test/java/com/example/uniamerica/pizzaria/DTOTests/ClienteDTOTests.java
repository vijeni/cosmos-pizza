package com.example.uniamerica.pizzaria.DTOTests;

import com.example.uniamerica.pizzaria.dto.EnderecoDTO;
import com.example.uniamerica.pizzaria.dto.PessoaDTO;
import com.example.uniamerica.pizzaria.entity.Role;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
 class ClienteDTOTests {
    private PessoaDTO pessoaDTO = new PessoaDTO();
    private EnderecoDTO endereco = new EnderecoDTO();
    @BeforeEach
    void setup() {
        pessoaDTO.setId(1L);
        pessoaDTO.setNome("Joao");
        pessoaDTO.setCpf("676.990.230-30");
        pessoaDTO.setTelefone("999999999");
        pessoaDTO.setEndereco(endereco);
        pessoaDTO.setRole(Role.FUNCIONARIO);
    }
    @Test
    void pessoaIdTest(){
        assertEquals(1L, pessoaDTO.getId());
    }
    @Test
    void pessoaNomeTest(){
        assertEquals("Joao", pessoaDTO.getNome());
    }
    @Test
    void pessoaCpfTest(){
        assertEquals("676.990.230-30", pessoaDTO.getCpf());
    }
    @Test
    void pessoaTelefoneTest(){
        assertEquals("999999999", pessoaDTO.getTelefone());
    }
    @Test
    void pessoaEnderecoTest(){
        assertEquals(endereco, pessoaDTO.getEndereco());
    }
    @Test
    void pessoaTipoTest(){
        assertEquals(Role.FUNCIONARIO, pessoaDTO.getRole());
    }
    @Test
    void pessoaAllArgsConstructorTest(){
        PessoaDTO pessoaAllArgs = new PessoaDTO("Joao", "676.990.230-30", "999999999", endereco, Role.FUNCIONARIO);
        assertThat(pessoaDTO).usingRecursiveComparison().ignoringFields("id").isEqualTo(pessoaAllArgs);
    }
}