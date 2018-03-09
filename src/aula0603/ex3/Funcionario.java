//Uma subclasse de Pessoa, chamada Funcionario. A classe Funcionario deve ter os
//atributos matricula (tipo int) e salario (tipo double). Use encapsulamento.

package aula0603.ex3;

public class Funcionario extends Pessoa {

	private int matricula;
	private double salario;
	
	public Funcionario() {
		super();
	}
	
	//Assinatura void setSalario(int valor)
	//Efeito Atribui ao atributo sal�rio o valor recebido como par�metro desde que este valor
	//n�o seja negativo. Caso seja negativo, n�o faz nada.

	public Funcionario(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome);
		this.matricula = matricula;
		this.salario = salario;
	}

	public void setSalario(int valor) {
		if (valor > 0) {
			salario = valor;
		}

	}
	
	//Todo funcion�rio recebe seu sal�rio em duas parcelas, sendo 60% na primeira parcela e 40% na
	//segunda parcela. Assim, escreva os m�todos:
	
	public double getSalario() {
		return salario;
	}

	//Assinatura double getSalarioPrimeiraParcela()
	//Efeito Retorna o valor da primeira parcela do sal�rio (60%)
	public double getSalarioPrimeiraParcela() {
		return (salario * 0.6);
	}
	
	//Assinatura double getSalarioSegundaParcela()
	//Efeito Retorna o valor da segunda parcela do sal�rio (40%)
	
	public double getSalarioSegundaParcela() {
		return (salario * 0.4);
	}
}











