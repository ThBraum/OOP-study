package POO;

import java.util.ArrayList;
import java.util.List;

public class Main extends Livraria{

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", "Romance", 25, 270, true, 0, 0, 30);
		Livro l2 = new Livro("Mem�rias P�stumas de Br�s Cubas", "Machado de Assis", "Romance/Fic��o", 40, 300, true, 0, 0, 50);
		Livro l3 = new Livro("Harry Potter", "J. K. Rowling", "Literatura fant�stica", 75, 300, true, 0, 0, 80);
		Livro l4 = new Livro("Senhor dos an�is", "J. R. R. Tolkien", "Literatura fant�stica", 45, 500, true, 0, 0, 120);
		Livro l5 = new Livro("A Culpa � das Estrelas", "John Green", "Romance", 120, 255, true, 0, 0, 30);
		Livro l6 = new Livro("Tartarugas At� L� Embaixo", "John Green", "Romance/Fic��o juvenil", 60, 300, true, 0, 0, 30);
		Livro l7 = new Livro("A Menina Que Roubava Livros", "Markus Zusak", "Romance/Fic��o juvenil", 35, 500, true, 0, 0, 10);
		Livro l8 = new Livro("It: A coisa", "Stephen King", "Terror", 15, 1100, true, 0, 0, 130);
		

		List<Livro> Livros = new ArrayList<>();
		Livros.add(l1);
		Livros.add(l2);
		Livros.add(l3);
		Livros.add(l4);
		Livros.add(l5);
		Livros.add(l6);
		Livros.add(l7);
		Livros.add(l8);
		
		Livraria leiasempre = new Livraria("leiasempre", "123456", Livros);
		
		System.out.println("Livros dispon�veis: \n");
		leiasempre.listarLivros();
		System.out.println("Obs: Pre�os j� atualizados - descontos e impostos.\n");
		System.out.println("\n\nLivros acima de R$100,00 reais contam com desconto. Confira!\n");
		leiasempre.calcularDesconto();
		System.out.println("\n\nInforma��es sobre impostos:");
		leiasempre.calcularImpostos();
		System.out.println("\n\n");
		System.out.println("Livraria leiasempre. Patrim�nio atual em livros R$" + leiasempre.calcularPatrimonio());
		
	}

}
