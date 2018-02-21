package aula2002;

public class Circulo {
	
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double calcularArea() {

		double area = Math.PI * (raio * raio);

		return area;
	}

	public double calcularPerimetro() {

		double peri = (2 * Math.PI) * raio;

		return peri;
	}
}
