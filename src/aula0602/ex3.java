package aula0602;

import java.util.Scanner;

//Escreva um programa Java para ler os valores de quatro n�meros N1, N2,
//N3 e N4. Calcule e imprima o valor da m�dia aritm�tica dos mesmos.
public class ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N1 = scanner.nextInt();
		int N2 = scanner.nextInt();
		int N3 = scanner.nextInt();
		int N4 = scanner.nextInt();
		
		int media = (N1 + N2 + N3 + N4)/ 4;
		
		System.out.println("Media = " + media);

	}

}
