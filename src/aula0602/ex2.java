package aula0602;

import .*;
import java.util.Scanner;

//Escreva um programa Java para ler duas medidas de um ret�ngulo. O
//programa deve mostrar o per�metro e a �rea do ret�ngulo a partir das
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
