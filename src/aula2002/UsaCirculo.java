//3. (construtor) Escreva um programa que usa a classe desenvolvida no exerc�cio 1 para criar tr�s c�rculos com raios 32, 44
//e 17. Depois imprime as �reas e per�metros de todos os c�rculos.
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


