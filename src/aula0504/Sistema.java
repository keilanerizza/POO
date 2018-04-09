package aula0504;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	public static void main(String[] args) {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario(2.25);
		
		Funcionario roberto = new Gerente("Roberto", 1900);
		Funcionario robson = new Vendedor("Robson", 1200, 100, 120);
		Funcionario keilane = new Assistente("Keilane", 975);
		Funcionario gabriel = new Supervisor("Gabriel", 2500);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(roberto);
		funcionarios.add(robson);
		funcionarios.add(keilane);
		funcionarios.add(gabriel);
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println("\nFuncionario: "+funcionario.getNome()+" - Salario: "+ calculadora.calcula(funcionario));
		}
	}
}
