package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um numero: ");
            double num1 = leia.nextDouble();
        System.out.print("Digite outro numero: ");
            double num2 = leia.nextDouble();

       
        System.out.println("Qual operação você quer fazer ? ");
        String op = leia.next();

        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f ", num1, op, num2, resultado);


        leia.close();
    }
    
}
