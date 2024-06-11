package com.ironbull;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ironbull.model.Corrida;

public class CorridaTest {

    @Test
    public void testConstructorAndGetters() {
        Corrida corrida = new Corrida("Segunda-feira", 5000, 1800);
        
        assertEquals("Segunda-feira", corrida.getDiaDaSemana());
        assertEquals(5000, corrida.getDistancia());
        assertEquals(1800, corrida.getDuracao());
    }

    @Test
    public void testSetDiaDaSemana() {
        Corrida corrida = new Corrida("Segunda-feira", 5000, 1800);
        corrida.setDiaDaSemana("Terça-feira");
        
        assertEquals("Terça-feira", corrida.getDiaDaSemana());
    }

    @Test
    public void testSetDistancia() {
        Corrida corrida = new Corrida("Segunda-feira", 5000, 1800);
        corrida.setDistancia(6000);
        
        assertEquals(6000, corrida.getDistancia());
    }

    @Test
    public void testSetDuracao() {
        Corrida corrida = new Corrida("Segunda-feira", 5000, 1800);
        corrida.setDuracao(1900);
        
        assertEquals(1900, corrida.getDuracao());
    }
}
