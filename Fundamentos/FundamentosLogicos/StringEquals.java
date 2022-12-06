package Fundamentos.FundamentosLogicos;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2"); // nao usar esse tipo de comparacao com string

        String s = new String("2") ; // Assim da falso 
        System.out.println("2" == s); 
        System.out.println("2".equals(s)); // O equals compara os conteudos
        
        String s1 = "2" ; // Assim da verdadeiro
        System.out.println("2" == s1); 

        Scanner Scan = new Scanner(System.in);

        String s2 = Scan.nextLine(); // O nextLine ele nao remove os espaços em branco digitados e o Next sim.

        System.out.println("2" == s2.trim()); // O trim ele retira os espaços em branco
        System.out.println("2".equals(s2.trim())); // O trim ele retira os espaços em branco


Scan.close();

    }
    
}
