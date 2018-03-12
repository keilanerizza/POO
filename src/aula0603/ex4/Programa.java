//Em seguida realiza um depósito na conta no valor de 10000 e depois um saque de
//15000 da conta e um depósito na poupança no valor de 15000. Depois realize um saque de 20000
//na poupança e imprima o saldo da conta e da poupança.

package aula0603.ex4;

public class Programa {

	public static void main(String[] args) {
		Conta conta = new Conta(10000);
		conta.sacar(15000);
		System.out.println("Conta = " + conta.getSaldo());
		
		Poupanca poupanca = new Poupanca(15000, 13);
		poupanca.sacar(20000);
		System.out.println("Poupanca = " + poupanca.getSaldo());
	}

}
