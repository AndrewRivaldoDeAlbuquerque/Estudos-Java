package Fundamentos;

import javax.swing.JOptionPane;

public class QuadradoeCubo {
    public static void main(String[] args) {
        
        String v1 = JOptionPane.showInputDialog("Digite um numero para ser elevado ao QUADRADO e ao CUBO: ");

        Double r1 = Double.parseDouble(v1);
        double c1 = Math.pow(r1, 2);
        JOptionPane.showInputDialog("O numero digitado elevado ao QUADRADO é: ", c1);

        double r2 = Double.parseDouble(v1);
        double c2 = Math.pow(r2, 3);

        JOptionPane.showInputDialog("O numero digitado elevado ao CUBO é: ", c2);


       
    

    }
}
