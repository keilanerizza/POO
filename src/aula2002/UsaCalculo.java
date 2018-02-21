//Crie uma classe de teste que cria uma instancia de Calculo. Em seguida é feita uma operação de crédito no objeto 
//e depois outra operação de debito. Depois o programa mostrará o saldo final do objeto.

package aula2002;

public class UsaCalculo {

	public static void main(String[] args) {
		
		Calculo calc = new Calculo(1000);
		
		calc.credito(300);
		calc.debito(700);
		
		System.out.print(calc.getSaldo());
	}

}
