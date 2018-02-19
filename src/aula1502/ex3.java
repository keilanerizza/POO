//1.3. (atributo) Escreva uma classe para representar um paciente com atributos para armazenar nome, peso e altura.
package aula1502;

import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args){
        
    	Scanner scanner = new Scanner(System.in);
    	
    	Paciente paciente = new Paciente();
    	paciente.nome = scanner.nextLine();
    	paciente.peso = scanner.nextDouble();
    	paciente.altura = scanner.nextDouble();
    	
    	double massa = paciente.calcularIMC();
    	
    	System.out.println("Paciente : " + paciente.nome + "   massa = " + massa);
    }
}

class Paciente {
    String nome;
    double peso;
    double altura;
    
    // Assinatura double calcularIMC()
    // Efeito Retorna o indice de massa corpórea do paciente usando a fórmula: peso/altura2
    double calcularIMC() {
    	
    	double massa = peso * (altura * altura);
    	
    	return massa;
    }
}