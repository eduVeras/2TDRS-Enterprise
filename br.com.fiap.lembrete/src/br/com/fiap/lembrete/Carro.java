package br.com.fiap.lembrete;

import java.util.Calendar;

public class Carro extends Veiculo {

	public final int total = 0;
	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	public Calendar getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Calendar dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}


	public double peso;
	

	private Calendar dataFabricacao;
	
}
