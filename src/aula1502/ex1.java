//1.1. (atributo) Escreva uma classe para representar um círculo com um atributo chamado raio.
package aula1502;

import java.util.Scanner;

public class ex1 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        
        for(int i = 0; i < 6; i++){
            Circulo circ = new Circulo();
            
            switch(i){
                case 0: circ.raio = 3;
                break;
                case 1: circ.raio = 4;
                break;
                case 2: circ.raio = 7;
                break;
                default : 
                    double r = scanner.nextInt();
                    circ.raio = r;
                
            }
            //(%.2f", r);
            
            double area = circ.calcularArea();
            double peri = circ.calcularPerimetro();
            
            System.out.println("raio = " + circ.raio + "\n area = " + area + "\n perimetro = " + peri);
            
        }      
    }
}

class Circulo {
    double raio;
    
    // Assinatura double calcularArea()
    // Efeito Retorna a área do circulo calculada usando a fórmula: pi * raio2
    double calcularArea() {
        
        double area = Math.PI * (raio * raio);
        
        return area;
    }
    
    // Assinatura double calcularPerimetro()
    // Efeito Retorna o perímetro do circulo calculado usando a fórmula: 2* pi *raio
    double calcularPerimetro() {
        
        double peri = (2 * Math.PI) * raio;
        
        return peri;
    }
    
    //(usa classe) Escreva um programa que usa a classe desenvolvida no exercício 1.4 para criar três círculos com raios 3,
    //4 e 7. Depois imprime as áreas e perímetros de todos os círculos.
}
