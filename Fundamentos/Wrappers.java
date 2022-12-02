package Fundamentos;

public class Wrappers {
    public static void main(String[] args) {
         // Versões orientadas a objeto   
        // A diferença são essas que tem que iniciar com letra maiuscula, o unico que muda o nome é o tipo Int.

        Byte b = 100; 
        Short s = 1000;
        // Integer.parseInt(entrada.next())
        Integer i = 10000; // Int
        Long l = 1000000L;
        System.out.println(b.byteValue()); // Retorna o valor do b 
        System.out.println(s.toString()); // Transforma em uma string
        System.out.println(i * 2);
        System.out.println(l / 5);

        Float f = 125.5F;
        System.out.println(f);

        Double d = 243.245;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("false");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase()); // transforma em uma string para pode deixar em caixa alta

        Character c = 'A'; // Char
        System.out.println(c + "...");

    }
    
}
