//Escreva um programa de teste (Principal) onde deverão ser instanciados dois objetos da classe Aluno com valores:
//Aluno("Ana",10,9) e Aluno("Beto", 9,10).

package aula2002;

public class UsaAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Ana", 10, 9);
		Aluno aluno2 = new Aluno("Beto", 9, 10);
		
		System.out.println(aluno1.getNome() + " " +aluno1.media());
		System.out.println(aluno2.getNome() + " " + aluno2.media());
	}

}
