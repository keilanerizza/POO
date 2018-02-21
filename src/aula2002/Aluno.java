//(encapsulamento) Crie uma classe chamada Aluno contendo os seguintes atributos: nome, n1 e n2. Respeite a regra do
//encapsulamento. Essa classe tem um método chamado média que calcula a média aritmética das notas desse aluno.


package aula2002;

public class Aluno {
	
	private String nome;
	private double n1;
	private double n2;
	
	public Aluno(String nome, double n1, double n2) {
		super();
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public String getNome() {
		return nome;
	}

	public double media() {
		
		double media = (n1 + n2) / 2;
		
		return media;
	}

	
}
