package Fundamentos.FundamentosLogicos;

public class OpTernario {
    public static void main(String[] args) {
        double nota = 4.0;
        String resultadoParcial = nota >= 5 ? "EM RECUPERACAO" : "REPROVADO.";
        String resultadoFinal = nota >= 7 ? "APROVADO." : resultadoParcial;
        

        System.out.println("O aluno esta " + resultadoFinal);





    }
    
}
