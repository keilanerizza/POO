//(construtor) Escreva um programa que usa a classe desenvolvida no exerc�cio 2 para criar tr�s funcion�rios com nomes
//Jo�o, Mateus e Lucas. Jo�o trabalhou 20 horas a R$3,50 a hora. Mateus trabalhou 40 horas a R$5,50 a hora. Lucas
//trabalhou 40 horas a R$13,50 a hora. Depois imprime os sal�rios e nomes dos tr�s funcion�rios.

package aula2002;

public class UsaFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("Jo�o", 20, 3.50);
		Funcionario func2 = new Funcionario("Mateus", 40, 5.50);
		Funcionario func3 = new Funcionario("Lucas", 40, 13.50);
		
		System.out.println("Nome : " + func1.getNome() + "    salario : " + func1.calcularSalario());
		System.out.println("Nome : " + func2.getNome() + "    salario : " + func2.calcularSalario());
		System.out.println("Nome : " + func3.getNome() + "    salario : " + func3.calcularSalario());
	}

}
