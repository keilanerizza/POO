//(encapsulamento) Criar uma classe de nome CodigoPostal, com os atributos indicativo, extens�o e o nomeDaZona, para
//que possam ser armazenados c�digos como por exemplo: 38400-200 Centro. Para al�m dos usuais m�todos get e set
//implemente tamb�m o m�todo mostrar, que imprime a informa��o relativa a um determinado c�digo postal no formato:
//38400-200 Centro. 

package aula2002;

public class CodigoPostal {
	
	private String indicativo, extensao, nomeDaZona;

	public CodigoPostal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIndicativo() {
		return indicativo;
	}

	public void setIndicativo(String indicativo) {
		this.indicativo = indicativo;
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}

	public String getNomeDaZone() {
		return nomeDaZona;
	}

	public void setNomeDaZona(String nomeDaZona) {
		this.nomeDaZona = nomeDaZona;
	}
	
	public void mostrar() {
		
		System.out.print(indicativo + "-" + extensao + " " + nomeDaZona);
		
	}
	
}
