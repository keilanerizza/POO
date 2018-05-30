package designPattern.decorator;

public class TextoSimples implements Texto {

	@Override
	public String escrever() {
		
		return "Um Texto";
		
	}
	
	public static void main(String[] args) {
		
		Texto textoSimples = new TextoSimples();
		
		Texto textoTag = new TextoTag(textoSimples);
		System.out.println(textoTag.escrever());
		
		Texto textoAlto = new TextoCaixaAlta(textoSimples);
		System.out.println(textoAlto.escrever());
		
		Texto textoInvertido = new TextoInvertido(textoSimples);
		System.out.println(textoInvertido.escrever());

		textoTag = new TextoTag(new TextoCaixaAlta(textoSimples));
		System.out.println(textoTag.escrever());
	
		textoTag = new TextoTag(new TextoInvertido(textoSimples));
		System.out.println(textoTag.escrever());
	
		textoAlto = new TextoCaixaAlta(new TextoInvertido(textoSimples));
		System.out.println(textoAlto.escrever());
		
		Texto texto = new TextoTag(new TextoInvertido(new TextoCaixaAlta(textoSimples)));
		System.out.println(texto.escrever());
	}

}
