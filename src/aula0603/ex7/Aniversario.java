package aula0603.ex7;

public class Aniversario extends CartaoWeb {

	public Aniversario(String destinatario) {
		super(destinatario);
	}
	
	public void showMessage() {
		System.out.println("Feliz aniversario " + getDestinatario());

	}

}
