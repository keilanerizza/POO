package aula0802;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String palavra1 = scanner.nextLine();
		String palavra2 = scanner.nextLine();
		
		if(palavra1.equals(palavra2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		System.out.println(palavra1.toUpperCase());

	}

}
