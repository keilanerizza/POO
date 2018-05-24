package designPattern.chainOfResponsability;

public class CalculadoraDeTroco {

	double troco(Conta conta) {
		ChainMoeda umC = new UmCentavo();
		ChainMoeda cincoC = new CincoCentavos();
		ChainMoeda dezC = new DezCentavos();

		umC.setProximo(cincoC);
		cincoC.setProximo(dezC);
		
		return umC.troco(conta);

	}
}
