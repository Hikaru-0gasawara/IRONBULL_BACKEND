package com.ironbull.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    
    private String id;
    private String nome;
    private String genero;
    private int idade;
    private double peso;
    private double altura;
    
    private List<Corrida> corridas;
    private List<Musculacao> musculacoes;
    
    public Usuario(String id, String nome, String genero, int idade, double peso, double altura) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public List<Corrida> getCorridas() {
		return corridas;
	}

	public void setCorridas(List<Corrida> corridas) {
		this.corridas = corridas;
	}

	public List<Musculacao> getMusculacoes() {
		return musculacoes;
	}

	public void setMusculacoes(List<Musculacao> musculacoes) {
		this.musculacoes = musculacoes;
	}

	public void adicionarCorrida(Corrida corrida) {
        corridas.add(corrida);
    }

    public void adicionarMusculacao(Musculacao musculacao) {
        musculacoes.add(musculacao);
    }

    public List<Corrida> obterTodasCorridas() {
        return new ArrayList<>(corridas);
    }

    public List<Musculacao> obterTodasMusculacoes() {
        return new ArrayList<>(musculacoes);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
