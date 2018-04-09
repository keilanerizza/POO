package aula0504;

public abstract class Funcionario {

	private String nome;
	private double salarioBase;

	public Funcionario(String nome, double salarioBase) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}
	
	abstract double calculaSalario();


}
