package Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        // String é um objeto imutavel 
        System.out.println("Bom dia".charAt(2)); // CharAt pega o valor da string de numero 2.

        String  s= "Bom dia";

        System.out.println(s.concat("!!!"));

        System.out.println(s + "!!!");

        System.out.println(s.startsWith("Boa")); // "Inicia com" boa ?

        System.out.println(s.length()); // Saber o tamanho da string

        System.out.println(s.endsWith("dia")); // Verifica se o final é igual a string digitada dentro do metodo

        System.out.println(s.equals("bom dia"));

        System.out.println(s.equalsIgnoreCase("Bom dia"));

        System.out.printf("%d %n", 65); // Imprime valores inteiros

        System.out.printf("%s %n", "Bom dia, senhorita!"); // Imprime valores em string 

        System.out.printf("%.1f %n", 234.544);  // Imprime valores float mostrando apenas uma casa decimal 


    }
}
