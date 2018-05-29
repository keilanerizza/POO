package designPattern.chainOfResponsability;

public class M10 extends ChainMoeda {

	@Override
	void calculaTroco(int moeda) {
		if(moeda >= 10) {
			 valorCapturado += moeda;
		} else {
			getProximo().calculaTroco(moeda);
		}
	}

}
