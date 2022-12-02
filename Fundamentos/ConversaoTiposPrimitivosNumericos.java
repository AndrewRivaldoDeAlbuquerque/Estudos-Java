package Fundamentos;

import javax.swing.JOptionPane;

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

    // Conversao de String para Numero 
    String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero: "); // showInputDialog abre uma janela do java para inserir algum valor
    String valor2 = JOptionPane.showInputDialog("Digite o segundo numero: "); // JOptionPane ele va fazer aparecer uma janela virtual 
    
    System.out.println(valor1 + valor2);

    double v1 = Double.parseDouble(valor1); // Transforma o a string no tipo double 
    double v2 = Double.parseDouble(valor2);

    System.out.println(v1 + v2);

}
}
