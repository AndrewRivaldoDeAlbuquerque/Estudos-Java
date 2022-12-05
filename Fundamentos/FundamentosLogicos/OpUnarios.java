package Fundamentos.FundamentosLogicos;

public class OpUnarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // a = a + 1;
        a--; // a = a - 1;

        b++; // b = b + 1;
        b--; // b = b - 1;

        System.out.println(++a == b--); // true porque primeiro executa o 'a' depois compara e o b so vai subtrair o valor depois da comparacao
        System.out.println(a == b); // aqui vai da falso justamente por causa disso

    }
    
}
