package aula0503;

public class Filme {

	private String nome;
	private Cliente emprestado;

	public boolean getEmprestado() {
		return emprestado != null ? true : false;
	}

	public void setEmprestado(Cliente emprestado) {
		this.emprestado = emprestado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Filme(String nome) {
		super();
		this.nome = nome;
	}
}
