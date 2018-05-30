package designPattern.decorator;

public class TextoInvertido implements Texto {

	protected Texto t;
	
	public TextoInvertido(Texto texto) {
		t = texto;
	}

	@Override
	public String escrever() {
		return new StringBuilder(t.escrever()).reverse().toString();
	}
}
