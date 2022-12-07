package Fundamentos;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print ("Digite seu peso: ");
        double peso = leia.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = leia.nextDouble();
        
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f ", imc);

        leia.close();
    }
}
