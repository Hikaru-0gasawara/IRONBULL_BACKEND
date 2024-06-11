package com.ironbull.model;

public class Musculacao {
	
	private String diaDaSemana;
	private int tempoGasto;
	private String tipo;
	private int peso;
	private int quantidadeRepeticao;
	
	public Musculacao(String diaDaSemana, int tempoGasto, String tipo, int peso, int quantidadeRepeticao) {
		super();
		this.diaDaSemana = diaDaSemana;
		this.tempoGasto = tempoGasto;
		this.tipo = tipo;
		this.peso = peso;
		this.quantidadeRepeticao = quantidadeRepeticao;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public int getTempoGasto() {
		return tempoGasto;
	}

	public void setTempoGasto(int tempoGasto) {
		this.tempoGasto = tempoGasto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getQuantidadeRepeticao() {
		return quantidadeRepeticao;
	}

	public void setQuantidadeRepeticao(int quantidadeRepeticao) {
		this.quantidadeRepeticao = quantidadeRepeticao;
	}
}
