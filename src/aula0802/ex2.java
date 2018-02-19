package aula0802;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Circulo circ = new Circulo();
		circ.raio = scanner.nextDouble();
		
		double area = circ.calcularArea();
        double peri = circ.calcularPerimetro();
        
        System.out.println("raio = " + circ.raio + "\n area = " + area + "\n perimetro = " + peri);
	}

}

class Circulo {
    double raio;
    
    double calcularArea() {
        
        double area = Math.PI * (raio * raio);
        
        return area;
    }
    
    double calcularPerimetro() {
        
        double peri = (2 * Math.PI) * raio;
        
        return peri;
    }
}
