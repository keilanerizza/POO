package aula0602;

import .*;
import java.util.Scanner;

//(estrutura condicional) Escreva um programa Java para ler os valores de
//quatro n�meros N1, N2, N3 e N4. Calcule e imprima o valor da m�dia
//aritm�tica dos mesmos. Imprimir tamb�m uma mensagem de "aprovado"
//ou "reprovado" no caso da m�dia ser maior ou igual a seis, ou menor,
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
