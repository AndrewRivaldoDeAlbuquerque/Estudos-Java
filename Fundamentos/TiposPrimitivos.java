package Fundamentos;
    public class TiposPrimitivos {
    public static void main(String [] args) {
       
        // Informações do funcionario
        byte anosDeEmpresa = 24;
        short numeroDeVoos = 435;
        int id= 567523;
        long pontosAcumulados = 4_323_232_455L; // para saber que é do tipo long se poe um "L" no final do numero.
    
        // Tipos numericos reais 
        float salario = 11_445_23F; // tem que colocar o "F" no final
        double vendasAcumuladas = 7_323_498_049.05; 

        // Tipo booleano 
        boolean estaDeFerias = false; // true

        // Tipo caractere 
        char status = 'A'; // ativo 

        //Dias de empresa 
        System.out.println(anosDeEmpresa * 365);

        //Numero de viagens 
        System.out.println(numeroDeVoos / 2);

        // Pontos por real 
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}