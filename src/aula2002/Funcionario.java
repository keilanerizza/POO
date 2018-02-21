package aula2002;

public class Funcionario {
	
	private String nome;
    private double horasTrabalhadas;
    private double valorHora;
    
	public String getNome() {
		return nome;
	}

	public Funcionario(String nome, double horasTrabalhadas, double valorHora) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	
	

    public double calcularSalario() {
        
        double salario = horasTrabalhadas * valorHora;
        
        return salario;
    }
}
