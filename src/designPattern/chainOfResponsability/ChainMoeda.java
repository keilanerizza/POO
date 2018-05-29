package designPattern.chainOfResponsability;

public abstract class ChainMoeda {
	
	private ChainMoeda proximo;
	static int valorCapturado;

	public ChainMoeda getProximo() {
		return proximo;
	}

	public void setProximo(ChainMoeda proximo) {
		this.proximo = proximo;
	}
	
	protected int valorCapturado() {
		return valorCapturado;
	}
	
	abstract void calculaTroco(int v);
	
	
}
