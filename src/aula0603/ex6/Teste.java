package aula0603.ex6;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		Gerente gerente = new Gerente("Maria", "123", 1000);
		funcionarios.add(gerente);
		
		Assistente assistente = new Assistente("Jose", "456", 850);
		funcionarios.add(assistente);
		
		Vendedor vendedor = new Vendedor(350, "João", "789", 700);
		funcionarios.add(vendedor);
		
		for(Funcionario f : funcionarios) {
			System.out.println(f.getNome() + " - " + f.calculaSalario());
		}
	}

}
