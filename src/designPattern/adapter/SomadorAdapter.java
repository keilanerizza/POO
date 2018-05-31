package designPattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter extends SomadorExistente implements SomadorEsperado {
	List<Integer> lista = new ArrayList<>();
	
	@Override
	public int somaVetor(int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
			lista.add(vetor[i]);
		}

		int somaLista = somaList(lista);
		
		return somaLista;
	}

}
