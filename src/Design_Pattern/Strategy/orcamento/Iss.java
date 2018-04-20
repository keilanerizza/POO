package Design_Pattern.Strategy.orcamento;

public class Iss implements Imposto{

	@Override
	public void calculaImposto(Orcamento orcamento) {
		
		double iss = orcamento.getValor() * 0.06;
		System.out.println(iss);
		
	}
	
}
