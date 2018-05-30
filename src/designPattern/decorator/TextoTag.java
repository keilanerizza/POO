package designPattern.decorator;

public class TextoTag implements Texto {

	protected Texto t;
	
	public TextoTag(Texto texto) {
		t = texto;
	}

	@Override
	public String escrever() {
		return "<b>" + t.escrever() + "</b>";
		
	}
}
