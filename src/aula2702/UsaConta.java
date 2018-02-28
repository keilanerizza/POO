package aula2702;

public class UsaConta {

	public static void main(String[] args) {
		//1 - Tente criar uma Conta no main e modificar ou ler um de seus atributos privados. O que acontece?
		// R: O código não compila ao tentar ler ou modificar um atributo marcado como 'private'.
		//Aparecendo a mensagem "The field Conta.saldo is not visible"
		Conta conta = new Conta();
		
		System.out.println(conta.getIdentificador());
		
		Conta conta2 = new Conta("Keilane");
		
		conta.deposita(500);
		System.out.println(conta.getSaldo());
		conta.saca(200);
		System.out.println(conta.getSaldo());
		
		System.out.println(conta2.getIdentificador());
	}

}
