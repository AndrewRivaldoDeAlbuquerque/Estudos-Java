package Controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      
        System.out.print("Informe a media: ");
        double media = leia.nextDouble();

        if (media >= 7.0) {
            System.out.print("Aluno Aprovado");
        }
        
        if (media < 7 )
        {
            System.out.print("Aluno Reprovado");
        }
     leia.close();
    }
}
