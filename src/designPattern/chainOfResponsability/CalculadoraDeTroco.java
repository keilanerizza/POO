package designPattern.chainOfResponsability;

import java.util.Scanner;

public class CalculadoraDeTroco {
	
	protected ChainMoeda moeda;

	public CalculadoraDeTroco() {
		ChainMoeda Umc = new M05();
		ChainMoeda cincoC = new M10();
		moeda = new M50();

		moeda.setProximo(cincoC);
		cincoC.setProximo(Umc);

	}
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.caixa("refrigerante", 200);
		conta.caixa("salgado", 350);
		
		System.out.println("valor compra: " + conta.valorConta() + "-- insira moedas ...");
		
		CalculadoraDeTroco calc = new CalculadoraDeTroco();
		
		do{
			Scanner scanner = new Scanner(System.in);
			int v = scanner.nextInt();
			calc.moeda.calculaTroco(v);
			
		} while (calc.moeda.valorCapturado() < conta.valorConta());
		
		int troco = calc.moeda.valorCapturado() - conta.valorConta();
		
		for(Produto p : conta.produtos) {
			System.out.println("Compra = " + p.getNome() + " -- Troco = " + troco);
		}
	}
}
