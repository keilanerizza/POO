//Em seguida realiza um dep�sito na conta no valor de 10000 e depois um saque de
//15000 da conta e um dep�sito na poupan�a no valor de 15000. Depois realize um saque de 20000
//na poupan�a e imprima o saldo da conta e da poupan�a.

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
