package Design_Pattern.Strategy.estatistica;

import java.util.Arrays;
import java.util.Random;

public class Sistematico implements Amostragem{
	
	@Override
	public int[] separaAmostra(int[] subConjunto, Random generator, int[] populacao, int tamanhoAmostra) {
		
		// faz c�pia da popula��o.
		// n�o queremos causar efeitos colaterais.
		int[] populacaoOrdenada = new int[populacao.length];
		System.arraycopy(populacao, 0, populacaoOrdenada, 0, populacao.length);
		Arrays.sort(populacaoOrdenada);

		int step = populacaoOrdenada.length / tamanhoAmostra;
		int startingPoint = generator.nextInt(step);

		// seleciona elementos em intervalo regular �step�
		for (int i = 0;i < tamanhoAmostra; i++)
			subConjunto[i] = populacaoOrdenada[startingPoint + (i * step)];

		return subConjunto;
	}
	
}
