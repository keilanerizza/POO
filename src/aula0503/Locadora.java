package aula0503;

public class Locadora {

	public static void main(String[] args) {
		//Criar objetos Filme: BATMAN, X-MEN, HULK, IRON MAN
		
		Filme batman = new Filme("BATMAN");
		Filme xmen = new Filme("X-MEN");
		Filme hulk = new Filme("HULK");
		Filme ironman = new Filme("IRON MAN");
		
		Cliente joao = new Cliente("João", "123");
		Cliente maria = new Cliente("Maria", "456");

		joao.emprestar(batman);
		joao.emprestar(hulk);
		
		imprimeFilmes(joao);
		
		joao.devolver(batman);
		joao.devolver(hulk);
		
		imprimeFilmes(joao);
	}
	
	private static void imprimeFilmes(Cliente cliente) {
		System.out.println("Filmes emprestados para: " + cliente.getNome());
		for(Filme filme : cliente.getEmprestados()) {
			System.out.println(filme.getNome());
		}
	}

}
