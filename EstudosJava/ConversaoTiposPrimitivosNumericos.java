package EstudosJava;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
       // Conversao dos Tipos Primitivos Numericos
        double a = 1; // Conversao implícita 
        System.out.println(a);
       
        float b = (float) 1.3223232324; // Conversao explicita (CAST)
        System.out.println(b);

        int c = 20;
        byte d = (byte) c; // Conversao explicita (CAST)
        System.out.println(d);

        double e = 1.333;
        int f = (int) e; // Conversao explicita (CAST)
        System.out.println(f);

    // Conversao de Numero para String 
        Integer num1 = 10000;
        System.out.println(num1.toString());

        int num2 = 1000000;
        System.out.println(Integer.toString(num2));

        System.out.println(("" + num2).length()); //  o length fala o tamanho da string
    }
}
