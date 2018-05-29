package designPattern.chainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	List<Produto> produtos = new ArrayList<>();
	
	void caixa (String nome, double valor){
		Produto produto = new Produto();
		
		produto.setNome(nome);
		produto.setValor(valor);
		produtos.add(produto);
	}
	
	int valorConta() {
		int total = 0;
		
		for(Produto p : produtos) {
			total += p.getValor();
		}
		
		return total;
	}
}
