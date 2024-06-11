package com.ironbull;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ironbull.model.Musculacao;

public class MusculacaoTest {

    @Test
    public void testConstructorAndGetters() {
        Musculacao musculacao = new Musculacao("Segunda-feira", 60, "Bíceps", 20, 10);
        
        assertEquals("Segunda-feira", musculacao.getDiaDaSemana());
        assertEquals(60, musculacao.getTempoGasto());
        assertEquals("Bíceps", musculacao.getTipo());
        assertEquals(20, musculacao.getPeso());
        assertEquals(10, musculacao.getQuantidadeRepeticao());
    }

    @Test
    public void testSetDiaDaSemana() {
        Musculacao musculacao = new Musculacao("Segunda-feira", 60, "Bíceps", 20, 10);
        musculacao.setDiaDaSemana("Terça-feira");
        
        assertEquals("Terça-feira", musculacao.getDiaDaSemana());
    }

    @Test
    public void testSetTempoGasto() {
        Musculacao musculacao = new Musculacao("Segunda-feira", 60, "Bíceps", 20, 10);
        musculacao.setTempoGasto(75);
        
        assertEquals(75, musculacao.getTempoGasto());
    }

    @Test
    public void testSetTipo() {
        Musculacao musculacao = new Musculacao("Segunda-feira", 60, "Bíceps", 20, 10);
        musculacao.setTipo("Tríceps");
        
        assertEquals("Tríceps", musculacao.getTipo());
    }

    @Test
    public void testSetPeso() {
        Musculacao musculacao = new Musculacao("Segunda-feira", 60, "Bíceps", 20, 10);
        musculacao.setPeso(25);
        
        assertEquals(25, musculacao.getPeso());
    }

    @Test
    public void testSetQuantidadeRepeticao() {
        Musculacao musculacao = new Musculacao("Segunda-feira", 60, "Bíceps", 20, 10);
        musculacao.setQuantidadeRepeticao(12);
        
        assertEquals(12, musculacao.getQuantidadeRepeticao());
    }
}
