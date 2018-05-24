package designPattern.strategy.estatistica;

public class Cliente {
	public static void main(String args[]) {

		// Populacao
		int[] zipCodes = new int[] { 66209, 64113, 10162, 90210, 61701, 55901, 48823, 62901, 50014 };
		
		Amostragem randomico = new Randomico();
		Amostragem sistematico = new Sistematico();

		SelecionaMetodo amostrador = new SelecionaMetodo(zipCodes);
		int[] amostra = amostrador.selecionaSubconjunto(3, randomico);
		
		// imprime a amostra
		for (int i = 0; i < amostra.length; i++) {
			System.out.println(amostra[i]);
		}
		
		// Cria outra amostra usando um algoritmo diferente
		amostra = amostrador.selecionaSubconjunto(3, sistematico);

		for (int i = 0; i < amostra.length; i++) {
			System.out.println(amostra[i]);
		}
	}
}

