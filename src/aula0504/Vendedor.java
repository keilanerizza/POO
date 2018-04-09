package aula0504;

public class Vendedor extends Funcionario {
	
	private double totalVendas, meta;
	
	private double salario;
	
	public Vendedor(String nome, double salarioBase, double totalVendas, double meta) {
		super(nome, salarioBase);

	}
	
	public double calculaSalario() {
		
		if (totalVendas > meta)
			salario = getSalarioBase() + (totalVendas * 0.03) + 50;
		else
			salario = getSalarioBase() + (totalVendas * 0.03);
		
		return salario;
	}
}
