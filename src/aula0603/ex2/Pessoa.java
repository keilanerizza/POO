//(herança) Escreva uma classe chamada Pessoa com os atributos: nome (tipo String), sexo
//(tipo char), idade (tipo int).

package aula0603.ex2;

public class Pessoa {
	
	private String nome;
	private char sexo;
	private int idade;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, char sexo, int idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public char getSexo() {
		return sexo;
	}

	public int getIdade() {
		return idade;
	}

}
