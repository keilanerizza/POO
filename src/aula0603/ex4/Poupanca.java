package aula0603.ex4;

public class Poupanca extends Conta {

	private int diaRendimento;

	public Poupanca(double saldo, int diaRendimento) {
		super(saldo);
		this.diaRendimento = diaRendimento;
	}
	
	public void setSaldo(double valor) {
		//Efeito Atribui ao atributo saldo o valor recebido como par�metro desde que este valor n�o
		//seja negativo. Caso seja negativo, n�o faz nada.
		
		if(valor > 0) {
			depositar(valor);
		}
	}
	
	public void sacar(double valor) {
		//Efeito Subtrair o valor recebido como par�metro do atributo saldo desde que este valor n�o
		//seja negativo. Caso seja negativo, n�o faz nada.
		
		if((getSaldo() - valor) > 0) {
			sacar(valor);
		}
	}
}
