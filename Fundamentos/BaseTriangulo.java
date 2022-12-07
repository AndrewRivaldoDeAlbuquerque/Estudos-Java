package Fundamentos;

import java.util.Scanner;

public class BaseTriangulo {
   public static void main(String[] args) {
    
       Scanner leia = new Scanner(System.in);
       
       System.out.print("Digite a base do triângulo: ");
       double b = leia.nextDouble(); 
      
       System.out.print("Digite a altura do triângulo: ");
       double a = leia.nextDouble();
       
       double area = (b * a) / 2;

       System.out.printf("A área do triângulo é: %.2f cm", area);

       leia.close();
    }
}
