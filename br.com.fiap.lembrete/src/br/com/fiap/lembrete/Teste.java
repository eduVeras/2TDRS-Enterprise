package br.com.fiap.lembrete;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Teste {

	public static void main(String[] args) {
		Carro carro = new Carro();

		carro.setCor("");
		carro.setCategoria(Categoria.SUV);

		if (carro.getCategoria().equals(Categoria.A)) {
			System.out.println("SIM");
		}

		Calendar calendario = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		format.format(calendario.getTime());

		carro.setDataFabricacao(Calendar.getInstance());
	}

}
