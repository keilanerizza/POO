package aula0603.ex6;

public class Vendedor extends Funcionario {
	
	private double comissao;
	
	public Vendedor(double comissao, String nome, String matricula, double salario_base) {
		super(nome, matricula, salario_base);
		this.comissao = comissao;
	}
	
	double calculaSalario() {
		
		return getSalario_base() + comissao;
	}
}
