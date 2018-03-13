package aula0603.ex6;

public class Assistente extends Funcionario {
	
	public Assistente(String nome, String matricula, double salario_base) {
		super(nome, matricula, salario_base);
	}

	double calculaSalario() {
		
		return getSalario_base();
	}
}
