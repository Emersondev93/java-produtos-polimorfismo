package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Importado;
import entidades.Produtos;
import entidades.Usado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Quantidade de produtos: ");
		int qtd = sc.nextInt();

		List<Produtos> lista = new ArrayList();

		for (int i = 0; i < qtd; i++) {
			System.out.println("Dados do produto # " + (i+1));
			System.out.print("Tipo do produto (C=Comum, U=usado ou I=importado): ");
			char tipo;
			while (true) {
				tipo = Character.toUpperCase(sc.next().charAt(0));
				if (tipo == 'C' || tipo == 'U' || tipo == 'I') {
					break;
				}
				System.out.println("Tipo inválido !!!  Digite: C=Comum, U=usado ou I=importado");
			}
			System.out.print("Nome: ");
			String nome = sc.next();

			System.out.print("Preço: ");
			double preco = sc.nextDouble();

			if (tipo == 'I') {
				System.out.print("Taxa de importação: ");
				double taxaImport = sc.nextDouble();
				Produtos produto = new Importado(nome, preco, taxaImport);
				lista.add(produto);
			} else if (tipo == 'U') {
				System.out.print("Data de fabricação: ");
				String dataFabric = sc.next();
				LocalDate data = LocalDate.parse(dataFabric, fmt);
				Produtos produto = new Usado(nome, preco, data);
				lista.add(produto);
			}else {
			Produtos produto = new Produtos(nome, preco);
			lista.add(produto);
			}
		}
		System.out.println();

		System.out.println("ETIQUETAS DE PREÇOS: ");
		for (Produtos x : lista) {
			System.out.println(x.etiquetaPreco());
		}
		sc.close();
	}

}
