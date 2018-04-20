package Design_Pattern.Strategy.orcamento;

class CalculadoraDeImposto {
	private Imposto imposto;
	
	public CalculadoraDeImposto() {
		super();
	}
	
	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public void realizaCalculo(Orcamento orcamento) {
		imposto.calculaImposto(orcamento);
	}
	
}
