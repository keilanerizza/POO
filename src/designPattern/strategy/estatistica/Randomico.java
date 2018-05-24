package designPattern.strategy.estatistica;

import java.util.ArrayList;
import java.util.Random;

public class Randomico implements Amostragem{
	
	@Override
	public int[] separaAmostra(int[] subConjunto, Random generator, int[] populacao, int tamanhoAmostra) {
		
		// faz uma cópia usando ArrayList
		// fica fácil amostrar sem repetir
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		for (int i = 0; i < populacao.length; i++)
			tempArray.add(populacao[i]);

		for (int i = 0;i < tamanhoAmostra; i++)
			subConjunto[i] = tempArray.remove(generator.nextInt(tempArray.size()));

		return subConjunto;
		
	} 
	
}
