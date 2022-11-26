package EstudosJava;

import java.util.Scanner;

public class NotacaoPonto {
        public static void main(String[] args) {
            double a = 2.2;
            String s = "Bom dia :X";
            s = s.toUpperCase(); // deixa as letras maiusculas
            s = s.replace(":X", "Senhora!"); // Subsstitui o caracter que selecionamos
            System.out.println(s);
            System.out.println("andrew".toUpperCase()); // Outra forma de deixar as letras com caixa alta
    
            // tipos primitivos nao tem o operador "."
            
            /*  int x = 4;
            a. // nao vai funcinar  
            */
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite Nome: ");
            String nome = entrada.nextLine();

            System.out.println("Ola " + nome);

            
            System.out.print("Digite sua idade: ");
            int idade = entrada.nextInt();

            System.out.print("voce tem " + idade + " anos\n");

            System.out.printf("%s tem %d anos", nome, idade);

            entrada.close(); // Fechei o scanner

          /*   Scanner teclado = new Scanner(System.in);
 
                System.out.println("Qual a sua idade?");
                int I = teclado.nextInt(); // Nao vai ler o "qual o seu nome?", porque quando o NextInt le apenas o valor de entrada e nao le o \n que é gerado. Para resolver deve-se criar mais um (nextLine) para ele armazenar o valor \n que foi gerado. 
                System.out.println("Qual o seu nome?");
                String N = teclado.nextLine();
                System.out.println("Qual o seu sobrenome?");
                String SN = teclado.nextLine();
 
            teclado.close(); */



        }
    }