// 7. (encapsulamento) Crie uma classe chamada Calculo que deverá ter apenas um atributo inteiro chamado saldo que
// deverá ser encapsulado e inicializado com o valor 0. Essa classe conterá três métodos públicos chamados credito, debito
// e getSaldo. O método credito soma o valor recebido como parâmetro ao atributo saldo, o método debito subtrai o valor
// recebido como parâmetro do atributo saldo. Já o método getSaldo retorna o conteúdo do atributo saldo. 

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
