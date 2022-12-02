public class DesafioAritmeticos {
    public static void main(String[] args) {
        double v1 = (6 * (3 + 2));
        double r1 = Math.pow(v1, 2); // Pode fazer assim: double r1 = Math.pow(6 * ( 3 + 2), 2);
        double d1 = 3 * 2;
        double S1 = r1 / d1;
       
        System.out.println(v1);
        System.out.println(r1);
        System.out.println(S1);

        int v2 = (1 - 5) * (2 - 7);
        int d2 = v2 / 2;    
        int r2 =  (int) Math.pow(d2, 2);
 
        System.out.println(v2);
        System.out.println(d2);
        System.out.println(r2);

        double M1 = Math.pow(10, 3);

        double resolucao = S1 - r2;
        double L = Math.pow(resolucao, 3);

       System.out.println(" A resposta e " + L / M1);




    }   
    
}
