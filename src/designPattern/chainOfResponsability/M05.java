package designPattern.chainOfResponsability;

public class M05 extends ChainMoeda {

	@Override
	void calculaTroco(int moeda) {
		if(moeda >= 5) {
			 valorCapturado += moeda;
		}
	}

}
