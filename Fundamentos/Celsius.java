package Fundamentos;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual valor você deseja converter para farhrenheit ?");
        double celsiu = scan.nextDouble();

        double v1 = (celsiu * 9 / 5) + 32;

        System.out.printf("O valor de celsius convertido para farhrenheit é: %.2f", v1);

        scan.close();
    }
    
}
