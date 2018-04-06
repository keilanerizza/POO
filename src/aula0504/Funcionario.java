package aula0504;

public abstract class Funcionario {

	private String nome;
	private double salarioBase;
	private double incentivo = 150;

	public Funcionario(String nome, double salarioBase) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public double getIncentivo() {
		return incentivo;
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
