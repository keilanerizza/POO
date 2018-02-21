// (encapsulamento) Criar uma classe ContaCorrente que possua os seguintes atributos: nome, senha e saldo. Possui
// ainda os métodos cadastrarSenha que recebe uma senha como parâmetro e altera o atributo senha e o método
// alterarSenha que recebe como parâmetro a senha antiga e a nova senha. Ele alterará o atributo senha apenas se a
// senha antiga for a correta. Os métodos debitar e creditar também deverão ser implementados, eles receberão como
// parâmetro o valor a ser debitado ou creditado e a senha. Eles só deverão efetuar a operação caso a senha for correta.
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
