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
	//Efeito Atribui ao atributo salário o valor recebido como parâmetro desde que este valor
	//não seja negativo. Caso seja negativo, não faz nada.

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
	
	//Todo funcionário recebe seu salário em duas parcelas, sendo 60% na primeira parcela e 40% na
	//segunda parcela. Assim, escreva os métodos:
	
	public double getSalario() {
		return salario;
	}

	//Assinatura double getSalarioPrimeiraParcela()
	//Efeito Retorna o valor da primeira parcela do salário (60%)
	public double getSalarioPrimeiraParcela() {
		return (salario * 0.6);
	}
	
	//Assinatura double getSalarioSegundaParcela()
	//Efeito Retorna o valor da segunda parcela do salário (40%)
	
	public double getSalarioSegundaParcela() {
		return (salario * 0.4);
	}
}











