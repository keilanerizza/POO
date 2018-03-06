//O método devolver(Filme f) da classe Cliente altera o estado do filme, informando que o filme
//foi devolvido e o exclui da lista de filmes emprestados.

package aula0503;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
	
	private String nome, CPF;
	private List<Filme> emprestados;
	
	public void devolver(Filme f) {
		emprestados.remove(f);
		f.setEmprestado(null);
	}

	public void emprestar(Filme f) {
		if (!f.getEmprestado()) {
			emprestados.add(f);
			f.setEmprestado(this);
		}
	}
	
	public List<Filme> getEmprestados() {
		return Collections.unmodifiableList(emprestados);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public Cliente(String nome, String cPF) {
		super();
		this.nome = nome;
		this.CPF = cPF;
		emprestados = new ArrayList<Filme>();
	}
	
	
	
}
