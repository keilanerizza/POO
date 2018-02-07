import java.util.Scanner;

//Escreva um programa Java para ler duas medidas de um retângulo. O
//programa deve mostrar o perímetro e a área do retângulo a partir das
//medidas recebidas.
public class ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int altura = scanner.nextInt();
		int comprimento = scanner.nextInt();
		
		int perimetro = (altura * 2) + (comprimento * 2);
		int area = altura * comprimento;
		
		System.out.print("Perimetro = " + perimetro +" "+ "Area = " + area);

	}

}
