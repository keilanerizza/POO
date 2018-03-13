//Escreva um programa com um método main que cria um
//retângulo com base 3 e altura 4 e um círculo com raio 5 e armazene estes objetos em uma lista.
//Em seguida, imprima os perímetros e as áreas de todas as formas usando um laço for.

package aula0603.ex8;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		ArrayList<FormaGeometrica> fg = new ArrayList<FormaGeometrica>();
		
		Retangulos retangulo = new Retangulos(3, 4);
		fg.add(retangulo);
		
		Circulos circulo = new Circulos(5);
		fg.add(circulo);
		
		for(FormaGeometrica  forma : fg) {
			System.out.println("perimetro = " + forma.calcularPerimetro() + "   area = " + forma.calcularArea());
		}
	}

}
