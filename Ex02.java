
/**
 *
 * @author Vinicius
 */
public class exercicio2 {
    public static void main(String[] args) {
        //4 constantes inteiras
        final int VALOR1 = 20;
        final int VALOR2 = 10;
        final int VALOR3 = 5;
        final int VALOR4 = 2;
        
        //calculos:
        int adicao = VALOR1 + VALOR2;
        int subtracao = VALOR1 - VALOR3;
        int multiplicacao = VALOR4 * VALOR1;
        int divisao = VALOR2 / VALOR4;          
        int modulo = VALOR2 % VALOR3;            
       
        System.out.println("O resultado dos calculos:");
        System.out.println("O resultado da soma VALOR1+VALOR2 = " + VALOR1 + VALOR2);
        System.out.println("O resultado da subtracao VALOR1-VALOR3 = " + (VALOR1 - VALOR3));
        System.out.println("O resultado da multiplicacao VALOR4*VALOR3 = " + VALOR4 * VALOR1);
        System.out.println("O resultado da divisao VALOR2/VALOR4 = " + VALOR2 / VALOR4);
        System.out.println("O resultado do modulo VALOR2%VALOR3 = " + VALOR2 % VALOR3);       
    }
}
