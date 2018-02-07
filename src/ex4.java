import java.util.Scanner;

//(estrutura condicional) Escreva um programa Java para ler os valores de
//quatro números N1, N2, N3 e N4. Calcule e imprima o valor da média
//aritmética dos mesmos. Imprimir também uma mensagem de "aprovado"
//ou "reprovado" no caso da média ser maior ou igual a seis, ou menor,
//respectivamente.

public class ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N1 = scanner.nextInt();
		int N2 = scanner.nextInt();
		int N3 = scanner.nextInt();
		int N4 = scanner.nextInt();
		
		int media = (N1 + N2 + N3 + N4)/ 4;
		
		System.out.println("Media = " + media);
		
		if(media >= 6) {
			System.out.println("Aprovado !");
		} else {
			System.out.println("Reprovado !");
		}

	}

}
