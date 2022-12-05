package Fundamentos.FundamentosLogicos;

public class OpRelacionais {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a'; // cada letra tem consigo associado um numero

        System.out.println(a == b);    // igual
        System.out.println(10 != 11);  // diferente 
        System.out.println(7 <= 10);   // menor ou igual a
        System.out.println(7 >= 8);    // maior ou igual a 
        System.out.println(9 < 10);    // menor que 
        System.out.println(10 > 9);    // maior que 

        double nota = 8.5;
        boolean BomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean Desconto = passouPorMedia && BomComportamento;

        System.out.println("Tem desconto ? " + Desconto);


    }
    
}
