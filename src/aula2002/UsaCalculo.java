//Crie uma classe de teste que cria uma instancia de Calculo. Em seguida � feita uma opera��o de cr�dito no objeto 
//e depois outra opera��o de debito. Depois o programa mostrar� o saldo final do objeto.

package aula2002;

public class UsaCalculo {

	public static void main(String[] args) {
		
		Calculo calc = new Calculo(1000);
		
		calc.credito(300);
		calc.debito(700);
		
		System.out.print(calc.getSaldo());
	}

}
