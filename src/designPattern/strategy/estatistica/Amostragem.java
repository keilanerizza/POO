package designPattern.strategy.estatistica;

import java.util.Random;

public interface Amostragem {
	
	int[] separaAmostra(int[] subConjunto, Random generator, int[] populacao, int tamanhoAmostra);
}
