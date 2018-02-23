//(encapsulamento) Criar uma classe de nome Ret�ngulo com atributos base e altura do tipo inteiro. Esta classe deve ser
//encapsulada. Dever� ser criado um m�todo para cada um dos problemas abaixo:
//� Qual a �rea do ret�ngulo? (Formula: base x altura)
//� Qual o per�metro do ret�ngulo? (Formula: 2 x base + 2 x altura)
//� Este ret�ngulo � quadrado? Responde SIM ou N�O

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
