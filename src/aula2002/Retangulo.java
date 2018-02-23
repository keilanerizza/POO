//(encapsulamento) Criar uma classe de nome Retângulo com atributos base e altura do tipo inteiro. Esta classe deve ser
//encapsulada. Deverá ser criado um método para cada um dos problemas abaixo:
//• Qual a área do retângulo? (Formula: base x altura)
//• Qual o perímetro do retângulo? (Formula: 2 x base + 2 x altura)
//• Este retângulo é quadrado? Responde SIM ou NÃO

package aula2002;

public class Retangulo {

	private int base;
	private int altura;

	public Retangulo() {
		super();

	}

	public int calcularArea() {

		int area = base * altura;

		return area;
	}

	public int calcularPerimetro() {

		int peri = (2 * base) + (2 * altura);

		return peri;
	}
	
	public boolean eQuadrado () {
		
		if(base == altura)
			return true;
		else
			return false;
	}

}
