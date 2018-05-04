package Design_Pattern.Strategy.estatistica;

import java.util.Random;

public interface Amostragem {
	
	int[] separaAmostra(int[] subConjunto, Random generator, int[] populacao, int tamanhoAmostra);
}
