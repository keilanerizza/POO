package aula0603.ex3;

public class Programa {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Jo�o", "Medeiros");

		Funcionario pessoa2 = new Funcionario("Leonardo", "Messias", 100, 1000.0);

		Professor pessoa3 = new Professor("Ant�nio", "Silva", 200, 1500.0);

			//- Imprime o retorno do m�todo getNomeCompleto para os 3 objetos.
			//- Imprime o retorno dos m�todos getSalarioPrimeiraParcela e
			//getSalarioSegundaParcela para os objetos pessoa2 e pessoa3.
			
		System.out.println(pessoa1.getNomeCompleto());
		System.out.println(pessoa2.getNomeCompleto());
		System.out.println(pessoa3.getNomeCompleto());
		
		System.out.println(pessoa2.getSalarioPrimeiraParcela() + "  -  " + pessoa2.getSalarioSegundaParcela());
		System.out.println(pessoa3.getSalarioPrimeiraParcela() + "  -  " + pessoa3.getSalarioSegundaParcela());
	}
}
