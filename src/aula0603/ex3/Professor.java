//Uma subclasse de Funcionario, chamada Professor. Todo professor recebe seu salário em
//uma única parcela.

package aula0603.ex3;

public class Professor extends Funcionario {

	public Professor() {
		super();
	}

	// Assinatura double getSalarioPrimeiraParcela()
	// Efeito Retorna o valor integral do salário do professor

	public Professor(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome, matricula, salario);
	}

	public double getSalarioPrimeiraParcela() {
		return getSalario();
	}

	// Assinatura double getSalarioSegundaParcela()
	// Efeito Retorna o valor zero.
	
	public double getSalarioSegundaParcela() {
		return 0.0;
	}

}
