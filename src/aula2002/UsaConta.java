package aula2002;

public class UsaConta {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.cadastrarSenha("a1b2");
		System.out.println(conta.getSenha());
		
		conta.alterarSenha("a1b1", "a3b4");
		System.out.println(conta.getSenha());
		
		conta.alterarSenha("a1b2", "a3b4");
		System.out.println(conta.getSenha());
		
		
		System.out.println(conta.debitar(100, "a3b4"));
		System.out.println(conta.creditar(100, "a3b4"));
		System.out.println(conta.debitar(50, "a3b4"));
	}

}
