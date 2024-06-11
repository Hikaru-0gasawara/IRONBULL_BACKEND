package com.ironbull.model;

public class Corrida {
	
	private String diaDaSemana;
	private int distancia;
	private int duracao;
	
	public Corrida(String diaDaSemana, int distancia, int duracao) {
		super();
		this.diaDaSemana = diaDaSemana;
		this.distancia = distancia;
		this.duracao = duracao;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
}
