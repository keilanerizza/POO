package aula0603.ex3;

public class Programa {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("João", "Medeiros");

		Funcionario pessoa2 = new Funcionario("Leonardo", "Messias", 100, 1000.0);

		Professor pessoa3 = new Professor("Antônio", "Silva", 200, 1500.0);

			//- Imprime o retorno do método getNomeCompleto para os 3 objetos.
			//- Imprime o retorno dos métodos getSalarioPrimeiraParcela e
			//getSalarioSegundaParcela para os objetos pessoa2 e pessoa3.
			
		System.out.println(pessoa1.getNomeCompleto());
		System.out.println(pessoa2.getNomeCompleto());
		System.out.println(pessoa3.getNomeCompleto());
		
		System.out.println(pessoa2.getSalarioPrimeiraParcela() + "  -  " + pessoa2.getSalarioSegundaParcela());
		System.out.println(pessoa3.getSalarioPrimeiraParcela() + "  -  " + pessoa3.getSalarioSegundaParcela());
	}
}
