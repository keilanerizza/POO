//Uma classe Pessoa com atributos nome (tipo String) e sobrenome (tipo String). Use
//encapsulamento. A classe Pessoa ainda deve ter o seguinte m�todo:
//Assinatura String getNomeCompleto()
//Efeito Retorna a concatena��o do atributo nome com o atributo sobrenome
//Al�m disso, a classe deve possuir um construtor sem par�metros e outro construtor que recebe
//como par�metros o nome e o sobrenome da pessoa e armazena respectivamente nos atributos nome
//e sobrenome.

package aula0603.ex3;

public class Pessoa {

	private String nome, sobrenome;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return nome + " " + sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

}
