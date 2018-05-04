package Design_Pattern.Strategy.estatistica;

import java.util.Random;

public class Amostrador {
	private int[] populacao;

	public Amostrador(int[] codigosZip) {
		populacao = codigosZip;
	}

	public int[] selecionaSubconjunto(int tamanhoAmostra, Amostragem metodo) {
		
		int[] subConjunto = new int[tamanhoAmostra];
		Random generator = new Random();
		
		metodo.separaAmostra(subConjunto, generator, populacao, tamanhoAmostra);
		
		return null;
	}

	public int[] getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int[] populacao) {
		this.populacao = populacao;
	}
}