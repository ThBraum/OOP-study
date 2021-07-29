package POO;

import java.text.DecimalFormat;
import java.util.List;

public class Livraria extends Livro {
	DecimalFormat df = new DecimalFormat("###,##0.00");
	public String empresa;
	public String cnpj;
	public List<Livro> livros;
	
	double desconto = 0;
	double impostos = 0;
	
	public Livraria() {
		this.empresa = "";
		this.cnpj = "";
	}
	
	public Livraria(String empresa, String cnpj, List<Livro> livros) {
		this.empresa = empresa;
		this.cnpj = cnpj;
		this.livros = livros;
	} 
	
	
	public double calcularDesconto() {
		if(livros != null) {
			for (int i = 0; i < livros.size(); i++) {
				desconto = 0;
				if (livros.get(i).getPreco() >= 100) {
					desconto = (livros.get(i).getPreco() - (livros.get(i).getPreco() * 0.80));
					System.out.println("Livro: " + livros.get(i).getNome() 
							+ "\t Valor desconto R$" + df.format(desconto));
				}
				}
			}
		return desconto;	
	}
	
	public double calcularImpostos() {
		if (livros != null) {
			for (int i = 0; i < livros.size(); i++) {
				impostos = 0;
				impostos = (livros.get(i).getPreco() - (livros.get(i).getPreco() * 0.9));
				System.out.println("Livro: " + livros.get(i).getNome() 
						+ "\t Valor impostos R$" + df.format(impostos));
			}
		}
		return impostos;
	}
	
	public void listarLivros() {
		if (livros != null) {
			for (int i = 0; i < livros.size(); i++) {
				System.out.println("Livro: " + livros.get(i).getNome() 
						+ ", Autor: " + livros.get(i).getAutor() 
						+ ", Gênero: " + livros.get(i).getCategoria()  
						+ ", Qtd: " + livros.get(i).getQtd() 
						+ ", QtdPag: " + livros.get(i).getQtdPag());
				
				if(livros.get(i).getPreco() >= 100) {
					System.out.println("Preço R$" + df.format(((livros.get(i).getPreco() * 0.8) * 1.1)) + "\n");
				}else {
					System.out.println("Preço: R$" + df.format((livros.get(i).getPreco() * 1.1)) + "\n");
				}
				
			}
		}else {
			System.out.println("Sem livros em estoque.");
		}
	}
	
	public double calcularPatrimonio() {
		double patrimonio = 0;
		for (int i = 0; i < livros.size(); i++) {
			patrimonio = (((livros.get(i).getPreco() - desconto) + impostos) * livros.get(i).getQtd()) 
					+ patrimonio;  
		}
		return patrimonio;
	}
}
