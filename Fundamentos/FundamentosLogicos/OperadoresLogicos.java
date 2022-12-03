package Fundamentos.FundamentosLogicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 5 > 6;
        
        System.out.println(condicao1 && condicao2); // Condição "e" ou "and".
        System.out.println(condicao1 || condicao2); // "Ou" ou "Or".
        System.out.println(condicao1 ^ condicao2); // "xor" ou "Ou exclusivo"
        System.out.println(!! condicao1); // Vai retornar o mesmo valor, pois é um não 2 vezes
        System.out.println(! condicao1); // Nao

        System.out.println("\nTabela Verdade E (And)");
        System.out.println(true && true); // Verdadeiro 
        System.out.println(true && false); // Falso
//      System.out.println(false && true); // Falso
//      System.out.println(false && false); // Falso
       
        System.out.println("\nTabela Verdade Ou (OR)");
//      System.out.println(true || true); // Verdadeiro 
//      System.out.println(true || false); // Verdadeiro
        System.out.println(false || true); // Verdadeiro
        System.out.println(false || false); // Falso
     
        System.out.println("\nTabela Verdade XOR (OU EXCLUSIVO)");
        System.out.println(true ^ true); // Falso
        System.out.println(true ^ false); // Verdadeiro
        System.out.println(false ^ true); // Verdadeiro
        System.out.println(false ^ false); // Falso
     
        System.out.println("\nTabela Verdade NOT (NAO)");
        System.out.println(!true); // Falso 
        System.out.println(!false); // Verdadeiro
      
    }
    
}
