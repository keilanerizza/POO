//Criar uma classe de teste que instancia a classe CodigoPostal e testa seus m�todos. Use
//encapsulamento e forne�a o m�todo padr�o e um m�todo que recebe valores para iniciar todos os atributos.  38400-200 Centro

package aula2002;

public class UsaPostal {

	public static void main(String[] args) {
		
		CodigoPostal cp = new CodigoPostal();
		
		cp.setIndicativo("38400");
		cp.setExtensao("200");
		cp.setNomeDaZona("Centro");
		
		cp.mostrar();
	}

}
