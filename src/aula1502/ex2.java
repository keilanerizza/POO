//1.2. (atributo) Escreva uma classe para representar um funcionário com atributos para armazenar o nome, as horas
//trabalhadas e valor da hora.
package aula1502;

import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        
        for(int i = 0; i < 6; i++){
            Funcionario func = new Funcionario();
            
            switch(i){
                case 0: func.nome = "João";
                        func.horasTrabalhadas = 20;
                        func.valorHora = 3.50;
                break;
                case 1: func.nome = "Mateus";
                        func.horasTrabalhadas = 40;
                        func.valorHora = 5.50;
                break;
                case 2: func.nome = "Lucas";
                        func.horasTrabalhadas = 40;
                        func.valorHora = 13.50;
                break;
                default : 
                    func.nome  = scanner.nextLine();
                    func.horasTrabalhadas = scanner.nextInt();
                    func.valorHora = scanner.nextInt();
                
            }
            
            double salario = func.calcularSalario();
            
            System.out.println("funcionario : " + func.nome + "\n salario : " + salario);
            
        }      
    }
}

class Funcionario {
    String nome;
    double horasTrabalhadas;
    double valorHora;
    
    // Assinatura double calcularSalario()
    // Efeito Retorna o salário do funcionário usando a fórmula: horas trabalhadas * valor da hora
    double calcularSalario() {
        
        double salario = horasTrabalhadas * valorHora;
        
        return salario;
    }
    
    //(usa classe) Escreva um programa que usa a classe desenvolvida no exercício 1.5 para criar três funcionários com
    //nomes João, Mateus e Lucas. João trabalhou 20 horas a R$3,50 a hora. Mateus trabalhou 40 horas a R$5,50 a hora.
    //Lucas trabalhou 40 horas a R$13,50 a hora. Depois imprime os salários e nomes dos três funcionários.
    //1.10. (usa classe) Escreva um programa que usa a classe desenvolvida no exercício 1.5 para criar três funcionários com
    //nomes, horas trabalhadas e valores da hora lidos pelo teclado. Depois imprime os salários e nomes dos três
    //funcionários.
}