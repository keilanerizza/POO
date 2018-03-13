package aula0603.ex7;

public class DiaDosNamorados extends CartaoWeb {

	public DiaDosNamorados(String destinatario) {
		super(destinatario);
	}
	
	public void showMessage() {
		System.out.println("Feliz dia dos namorados " + getDestinatario());
	}

}
