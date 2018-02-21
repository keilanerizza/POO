// (encapsulamento) Criar uma classe ContaCorrente que possua os seguintes atributos: nome, senha e saldo. Possui
// ainda os m�todos cadastrarSenha que recebe uma senha como par�metro e altera o atributo senha e o m�todo
// alterarSenha que recebe como par�metro a senha antiga e a nova senha. Ele alterar� o atributo senha apenas se a
// senha antiga for a correta. Os m�todos debitar e creditar tamb�m dever�o ser implementados, eles receber�o como
// par�metro o valor a ser debitado ou creditado e a senha. Eles s� dever�o efetuar a opera��o caso a senha for correta.
// Observar o encapsulamento e escreva um programa de teste para a classe.

package aula2002;

public class ContaCorrente {

	private String nome, senha;
	private double saldo;
	
	public void cadastrarSenha(String senha) {
		this.senha = senha;
	}
	
	public void alterarSenha(String senhaAtual, String novaSenha) {
		
		if(senhaAtual.equals(this.senha)) {
			this.senha = novaSenha;
		}
	}
	
	public double debitar(double valor, String senha) {
		if(this.senha.equals(senha) && valor > this.saldo) {
			saldo -= valor;
		}
		return saldo;
	}
	
	public double creditar(double valor, String senha) {
		if(this.senha.equals(senha)) {
			saldo += valor;
		}
		
		return saldo;
	}

	public String getSenha() {
		return senha;
	}
}
