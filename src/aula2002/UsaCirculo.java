//3. (construtor) Escreva um programa que usa a classe desenvolvida no exercício 1 para criar três círculos com raios 32, 44
//e 17. Depois imprime as áreas e perímetros de todos os círculos.
package aula2002;

public class UsaCirculo {

	public static void main(String[] args) {

		Circulo circ1 = new Circulo(32);
		Circulo circ2 = new Circulo(44);
		Circulo circ3 = new Circulo(17);
		
		System.out.println("Area : " + circ1.calcularArea() + "   Perimetro : " + circ1.calcularPerimetro());
		System.out.println("Area : " + circ2.calcularArea() + "   Perimetro : " + circ2.calcularPerimetro());
		System.out.println("Area : " + circ3.calcularArea() + "   Perimetro : " + circ3.calcularPerimetro());

	}
}


