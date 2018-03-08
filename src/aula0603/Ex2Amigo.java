//Escreva agora outra classe chamada Amigo, que é uma pessoa
//(estende da classe Pessoa) de quem sabemos o dia de seu aniversário, atributo
//diaDoAniversario (tipo String). Use encapsulamento e forneça construtor padrão e
//construtor usando todos os atributos para as duas classes.

package aula0603;

public class Ex2Amigo extends Ex2Pessoa {
	
	private String diaDoAniversario;
	
	public Ex2Amigo() {
		super();
	}

	public Ex2Amigo(String diaDoAniversario) {
		super();
		this.diaDoAniversario = diaDoAniversario;
	}
}
