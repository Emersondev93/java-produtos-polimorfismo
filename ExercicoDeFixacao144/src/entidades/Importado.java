package entidades;

public class Importado extends Produtos {
	private Double taxaAlfan;

	public Importado(String nome, Double preco, Double taxaAlfan) {
		super(nome, preco);
		this.taxaAlfan = taxaAlfan;
	}

	public Double getTaxaAlfan() {
		return taxaAlfan;
	}

	public void setTaxaAlfan(Double taxaAlfan) {
		this.taxaAlfan = taxaAlfan;
	}

	public double precoTotal() {
		return getPreco() + taxaAlfan;
	}

	@Override
	public String etiquetaPreco() {
		return getNome() + " $" + String.format("%.2f", precoTotal()) + " Custo Importação: $"
				+ String.format("%.2f", taxaAlfan);

	}
}
