//(encapsulamento) Crie uma classe chamada Pessoa contendo os seguintes atributos: nome, cpf e idade. Respeite a
//regra do encapsulamento. Forneça métodos de acesso e modificadores (getters/setters). Escreva um programa de teste
//onde deverão ser instanciados dois objetos da classe e testado os métodos implementados.

package aula2002;

public class Pessoa {

	private String nome;
	private String cpf;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
