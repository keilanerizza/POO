package aula0603.ex6;

public abstract class Funcionario {

	private String nome, matricula;
	private double salario_base;
	
	public Funcionario(String nome, String matricula, double salario_base) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario_base = salario_base;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public double getSalario_base() {
		return salario_base;
	}
	
	abstract double calculaSalario();
}
