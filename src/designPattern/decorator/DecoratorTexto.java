package designPattern.decorator;

public class DecoratorTexto implements Texto{

	protected Texto texto;
	
	public DecoratorTexto(Texto t) {
		texto = t;
	}
	
	@Override
	public String escrever() {
		
		return texto.escrever();
		
	}

}
