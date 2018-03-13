package aula0603.ex7;

public abstract class CartaoWeb {

	private String destinatario;
	
	public CartaoWeb(String destinatario) {
		super();
		this.destinatario = destinatario;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public abstract void showMessage();
}
