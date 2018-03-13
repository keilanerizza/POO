package aula0603.ex8;

public class Circulos implements FormaGeometrica {
	
	private double raio;

	public Circulos(double raio) {
		super();
		this.raio = raio;
	}

	public double calcularPerimetro() {
		double perimetro = (2 * Math.PI) * raio;
		
		return perimetro;
	}

	public double calcularArea() {
		double area = Math.PI * raio * 2;
		
		return area;
	}
}
