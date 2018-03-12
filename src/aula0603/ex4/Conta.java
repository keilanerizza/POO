package aula0603.ex4;

public class Conta {

	private double saldo;
	
	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		//Efeito Acrescentar o valor recebido como par�metro ao atributo saldo
		
		saldo += valor;
	}
	
	public void sacar(double valor) {
		//Efeito Subtrair o valor recebido como par�metro do atributo saldo
	
		saldo -= valor;
	}

}
