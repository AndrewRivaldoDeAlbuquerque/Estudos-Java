import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
   
    Scanner leia = new Scanner(System.in);
    System.out.println("Digite o primeiro salario: ");
    String salario1 = leia.nextLine().replace(",", "."); // replace subititui uma string/char por outra que escolhemos
    System.out.println("Digite o segundo salario: ");
    String salario2 = leia.nextLine().replace(",", ".");
    System.out.println("Digite o terceiro salario: ");
    String salario3 = leia.nextLine().replace(",", ".");

    double v1 = Double.parseDouble(salario1);
    double v2 = Double.parseDouble(salario2);
    double v3 = Double.parseDouble(salario3);
   
   System.out.println(v1 + v2 + v3);
   double media = (v1 + v2 + v3) / 3;
   System.out.println("A media dos salarios: " + media );
    leia.close();
}
}
