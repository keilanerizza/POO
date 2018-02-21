//(construtor) Escreva um programa que usa a classe desenvolvida no exercício 2 para criar três funcionários com nomes
//João, Mateus e Lucas. João trabalhou 20 horas a R$3,50 a hora. Mateus trabalhou 40 horas a R$5,50 a hora. Lucas
//trabalhou 40 horas a R$13,50 a hora. Depois imprime os salários e nomes dos três funcionários.

package aula2002;

public class UsaFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("João", 20, 3.50);
		Funcionario func2 = new Funcionario("Mateus", 40, 5.50);
		Funcionario func3 = new Funcionario("Lucas", 40, 13.50);
		
		System.out.println("Nome : " + func1.getNome() + "    salario : " + func1.calcularSalario());
		System.out.println("Nome : " + func2.getNome() + "    salario : " + func2.calcularSalario());
		System.out.println("Nome : " + func3.getNome() + "    salario : " + func3.calcularSalario());
	}

}
