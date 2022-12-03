package Fundamentos.FundamentosLogicos;

public class DesafioLogicos {
    public static void main(String[] args) {
        boolean trabalho1 = true;
        boolean trabalho2 = true; 

        System.out.println(trabalho1 && trabalho2);
        System.out.println(trabalho1 && !trabalho2);
        System.out.println(trabalho1 || !trabalho2);
        System.out.println(!trabalho1 || !trabalho2);

        if ( trabalho1 && trabalho2 ) {
        System.out.println("Comparemos uma tv de 50 polegadas"); }
        if ( trabalho1 ^ !trabalho2) {
            System.out.println("Compraremos uma tv de 32 polegadas");
        }
        if ( trabalho1 || trabalho2) {
            System.out.println("Iremos tomar sorvete no shopping ");
        }
        if (!trabalho1 && !trabalho2 ) {
            System.out.println("Ficaremos em casa");
        }

    }
    }
    
