package aula0602;

import .*;

//(for) Escreva um programa Java para imprimir na tela todos os n�meros
//�mpares de 299 a 101 em ordem decrescente.

public class ex6 {
	
	public static void main(String[] args) {
		
		for(int i = 299; i >= 101; i--) {
			System.out.println(i);
			i--;
		}
	}
}
