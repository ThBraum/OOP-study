package POO;

public class Livro {
	public String nome;
	public String autor;
	public String categoria;
	public int qtd;
	public int qtdPag;
	//public boolean novo;
	public double preco;
	
	double impostos;
	double desconto;
	
	public Livro() {
		this.nome = "";
		this.autor = "";
		this.categoria = "";
		this.qtd = 0;
		this.qtdPag = 0;
		//this.novo = true;
		//this.impostos = 0;
		//this.desconto = 0;
		this.preco = 0;
	}

	public Livro(String nome, String autor, String categoria, int qtd, int qtdPag, boolean novo, double impostos,
			double desconto, double preco) {
		this.nome = nome;
		this.autor = autor;
		this.categoria = categoria;
		this.qtd = qtd;
		this.qtdPag = qtdPag;
		//this.novo = novo;
		//this.impostos = impostos;
		//this.desconto = desconto;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}


	/*public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}*/

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	
	
	
}
