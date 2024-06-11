package com.ironbull;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironbull.model.Corrida;
import com.ironbull.model.Musculacao;
import com.ironbull.model.ObjParaJson;
import com.ironbull.model.Usuario;

import org.junit.jupiter.api.Test;

public class ObjParaJsonTest {

    @Test
    public void testTransformarParaJson1() {
        Usuario usuario = new Usuario("1", "Rafael", "Masculino", 30, 70.5, 1.75);
        usuario.setCorridas(List.of(new Corrida("Segunda-feira", 5000, 1800)));
        usuario.setMusculacoes(List.of(new Musculacao("Segunda-feira", 60, "Bíceps", 20, 10)));

        String json = ObjParaJson.transformarParaJson(usuario);

        String expectedJson = "{\"id\":\"1\",\"nome\":\"Rafael\",\"genero\":\"Masculino\",\"idade\":30,\"peso\":70.5,\"altura\":1.75,\"corridas\":[{\"diaDaSemana\":\"Segunda-feira\",\"distancia\":5000,\"duracao\":1800}],\"musculacoes\":[{\"diaDaSemana\":\"Segunda-feira\",\"tempoGasto\":60,\"tipo\":\"Bíceps\",\"peso\":20,\"quantidadeRepeticao\":10}]}";
        assertEquals(expectedJson, json);
    }

    @Test
    public void testTransformarParaJson2() {
        Usuario usuario = new Usuario("2", "Daniel", "Masculino", 37, 76.5, 1.85);
        usuario.setCorridas(List.of(new Corrida("Quarta-feira", 2000, 1800)));
        usuario.setMusculacoes(List.of(new Musculacao("Sexta-feira", 60, "Bíceps", 25, 15)));

        String json = ObjParaJson.transformarParaJson(usuario);

        String expectedJson = "{\"id\":\"2\",\"nome\":\"Daniel\",\"genero\":\"Masculino\",\"idade\":37,\"peso\":76.5,\"altura\":1.85,\"corridas\":[{\"diaDaSemana\":\"Quarta-feira\",\"distancia\":2000,\"duracao\":1800}],\"musculacoes\":[{\"diaDaSemana\":\"Sexta-feira\",\"tempoGasto\":60,\"tipo\":\"Bíceps\",\"peso\":25,\"quantidadeRepeticao\":15}]}";
        assertEquals(expectedJson, json);
    }
}
