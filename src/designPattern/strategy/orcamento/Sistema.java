package designPattern.strategy.orcamento;

public class Sistema {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500.0);
		
		Imposto iss = new Iss();
		Imposto icms = new Icms();
		
		CalculadoraDeImposto calculador = new CalculadoraDeImposto();
		
		calculador.setImposto(iss);
		calculador.realizaCalculo(orcamento);
		
		calculador.setImposto(icms);
		calculador.realizaCalculo(orcamento);
	}
}
