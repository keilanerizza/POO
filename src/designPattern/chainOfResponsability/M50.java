package designPattern.chainOfResponsability;

public class M50 extends ChainMoeda {

	@Override
	void calculaTroco(int moeda) {
	
		if(moeda >= 50) {
			 valorCapturado += moeda;
		} else {
			getProximo().calculaTroco(moeda);
		}
	}

}
