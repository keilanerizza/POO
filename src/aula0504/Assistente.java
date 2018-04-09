package aula0504;

public class Assistente extends Funcionario {
	private double salario;

	public Assistente(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	public double calculaSalario() {
		salario = getSalarioBase();

		return salario;
	}

}
