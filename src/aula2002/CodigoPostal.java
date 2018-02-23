//(encapsulamento) Criar uma classe de nome CodigoPostal, com os atributos indicativo, extensão e o nomeDaZona, para
//que possam ser armazenados códigos como por exemplo: 38400-200 Centro. Para além dos usuais métodos get e set
//implemente também o método mostrar, que imprime a informação relativa a um determinado código postal no formato:
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
