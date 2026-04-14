package logica;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Ex13 {
     
    public static void main(String[] args) {
        //valores
        int celsius;
        double fahrenheit;      
        //
        Scanner entradaDados = new Scanner(System.in);
        //entrada de dados do celsius
        System.out.println("digite a temperatura em graus celsius: ");
        double c = entradaDados.nextDouble();
        //calculos
        fahrenheit = c * 1.8 + 32;
        
     
        System.out.println("esta é a temperatura em fahrenheit: "+fahrenheit);
        
        
        
        
        
        
        
        
    }
}