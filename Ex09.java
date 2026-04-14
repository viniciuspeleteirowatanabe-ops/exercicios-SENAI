package logica;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Ex09 {
       
   
    public static void main(String[] args) {
        int tensao;
        int potencia;
        int corrente;
        
         Scanner entradaDados = new Scanner(System.in);
        //
        System.out.println("Digite a tensao: ");
          int v = entradaDados.nextInt();
       
        System.out.println("Digite a potencia: ");
        int a = entradaDados.nextInt();
        
        int w;
        //Cálculos
        w = a * v;
        
        System.out.println("A corrente é: "+ w);
        
        
     
        
    }
    
}
