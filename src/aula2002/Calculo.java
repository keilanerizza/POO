// 7. (encapsulamento) Crie uma classe chamada Calculo que dever� ter apenas um atributo inteiro chamado saldo que
// dever� ser encapsulado e inicializado com o valor 0. Essa classe conter� tr�s m�todos p�blicos chamados credito, debito
// e getSaldo. O m�todo credito soma o valor recebido como par�metro ao atributo saldo, o m�todo debito subtrai o valor
// recebido como par�metro do atributo saldo. J� o m�todo getSaldo retorna o conte�do do atributo saldo. 

package aula2002;

public class Calculo {

	private double saldo;

	public Calculo(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double credito(double valor) {
		
		saldo += valor;

		return saldo;
	}

	public double debito(double valor) {
		
		saldo -= valor;

		return saldo;
	}

	public double getSaldo() {
		return saldo;
	}
}
