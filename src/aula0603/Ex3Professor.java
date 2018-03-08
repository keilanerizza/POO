//Uma subclasse de Funcionario, chamada Professor. Todo professor recebe seu sal�rio em
//uma �nica parcela.

package aula0603;

public class Ex3Professor extends Ex3Funcionario {

	public Ex3Professor() {
		super();
	}

	// Assinatura double getSalarioPrimeiraParcela()
	// Efeito Retorna o valor integral do sal�rio do professor

	public double getSalarioPrimeiraParcela() {
		return getSalario();
	}

	// Assinatura double getSalarioSegundaParcela()
	// Efeito Retorna o valor zero.
	
	public double getSalarioSegundaParcela() {
		return 0;
	}

}
