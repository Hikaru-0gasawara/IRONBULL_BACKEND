package com.ironbull;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ironbull.model.Corrida;
import com.ironbull.model.Musculacao;
import com.ironbull.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario("1", "Rafael", "Masculino", 30, 75.5, 1.80);
        usuario.setCorridas(new ArrayList<>());
        usuario.setMusculacoes(new ArrayList<>());
    }

    @Test
    public void testAdicionarCorrida() {
        Corrida corrida = new Corrida("Segunda-feira", 5000, 1800);
        usuario.adicionarCorrida(corrida);

        List<Corrida> corridas = usuario.getCorridas();
        assertEquals(1, corridas.size());
        assertEquals(corrida, corridas.get(0));
    }

    @Test
    public void testAdicionarMusculacao() {
        Musculacao musculacao = new Musculacao("Segunda-feira", 60, "Bíceps", 20, 10);
        usuario.adicionarMusculacao(musculacao);

        List<Musculacao> musculacoes = usuario.getMusculacoes();
        assertEquals(1, musculacoes.size());
        assertEquals(musculacao, musculacoes.get(0));
    }

    @Test
    public void testObterTodasCorridas() {
        Corrida corrida1 = new Corrida("Segunda-feira", 5000, 1800);
        Corrida corrida2 = new Corrida("Terça-feira", 6000, 2400);
        usuario.adicionarCorrida(corrida1);
        usuario.adicionarCorrida(corrida2);

        List<Corrida> corridas = usuario.obterTodasCorridas();
        assertEquals(2, corridas.size());
        assertTrue(corridas.contains(corrida1));
        assertTrue(corridas.contains(corrida2));
    }

    @Test
    public void testObterTodasMusculacoes() {
        Musculacao musculacao1 = new Musculacao("Segunda-feira", 60, "Bíceps", 20, 10);
        Musculacao musculacao2 = new Musculacao("Terça-feira", 45, "Costas", 25, 12);
        usuario.adicionarMusculacao(musculacao1);
        usuario.adicionarMusculacao(musculacao2);

        List<Musculacao> musculacoes = usuario.obterTodasMusculacoes();
        assertEquals(2, musculacoes.size());
        assertTrue(musculacoes.contains(musculacao1));
        assertTrue(musculacoes.contains(musculacao2));
    }
}
