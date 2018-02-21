package aula2002;

public class UsaPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setCpf("123");
		pessoa.setIdade(23);
		pessoa.setNome("Maria");
		
		System.out.println("Nome : " + pessoa.getNome() + "   idade : " + pessoa.getIdade() + "   cpf : " + pessoa.getCpf());

	}

}
