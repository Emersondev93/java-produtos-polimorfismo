package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entidades.Produtos;

public class Usado extends Produtos {
	private LocalDate dataFabric;

	public Usado(String nome, Double preco, LocalDate dataFabric) {
		super(nome, preco);
		this.dataFabric = dataFabric;
	}

	public LocalDate getDataFabricacao() {
		return dataFabric;
	}

	public void setDataFabricacao(LocalDate dataFabric) {
		this.dataFabric = dataFabric;
	}

	@Override
	public String etiquetaPreco() {
		return getNome() + " (Usado) $" + String.format("%.2f ", getPreco()) + "Data de fabricação: "
				+ dataFabric.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

}
