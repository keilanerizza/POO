package aula0603.ex8;

public class Retangulos implements FormaGeometrica {
	
	private double base;
	private double altura;
	
	public Retangulos(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double calcularPerimetro() {
		
		double perimetro = (2 * base) + (2 * altura); 
		
		return perimetro;
	}

	public double calcularArea() {
		
		double area = base * altura;
		
		return area;
	}
}
