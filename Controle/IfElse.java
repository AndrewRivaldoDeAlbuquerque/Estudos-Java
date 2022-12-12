package Controle;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite um numero: ");
        int n1 = Integer.parseInt(valor);

        if(n1 % 2 == 0){
            System.out.println("Numero par!");
        } else {
            System.out.println("Numero impar!");
        }
    }
}
