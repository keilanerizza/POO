package aula0603.ex7;

public class Natal extends CartaoWeb {

	public Natal(String destinatario) {
		super(destinatario);
	}
	
	public void showMessage() {
		System.out.println("Feliz natal " + getDestinatario());

	}

}
