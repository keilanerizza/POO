package designPattern.decorator;

public class TextoCaixaAlta implements Texto {

	protected Texto t;
	
	public TextoCaixaAlta(Texto texto) {
		t = texto;
	}
	@Override
	public String escrever() {
		return t.escrever().toUpperCase();
	}

}
