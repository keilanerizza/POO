//Escreva agora outra classe chamada Amigo, que � uma pessoa
//(estende da classe Pessoa) de quem sabemos o dia de seu anivers�rio, atributo
//diaDoAniversario (tipo String). Use encapsulamento e forne�a construtor padr�o e
//construtor usando todos os atributos para as duas classes.

package aula0603.ex2;

public class Amigo extends Pessoa {
	
	private String diaDoAniversario;

	public Amigo() {
		super();
	}

	public Amigo(String nome, char sexo, int idade, String dia) {
		super(nome, sexo, idade);
		diaDoAniversario = dia;
	}
	
	
}
