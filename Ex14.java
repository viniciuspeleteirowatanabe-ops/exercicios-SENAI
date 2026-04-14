package logica;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Ex14 {
     
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        //valores
        
        System.out.println("Digite o primeiro numero: ");
        double numero1 = entradaDados.nextDouble();
        
        System.out.println("Digite o segundo numero:");
        double numero2 = entradaDados.nextDouble();
        
        //
        double resultado1;
        double resultado2;
        double resultado3;
        double resultado4;
//calculos
        resultado1 = numero1 + numero2;
        resultado2 = numero1 - numero2;
        resultado3 = numero1 * numero2;
        resultado4 = numero1 / numero2;
        
        System.out.println("o resultado da soma é = "+resultado1);
        System.out.println("o resultado da subtracao é = "+resultado2);
        System.out.println("o resultado da multiplicacao é = "+resultado3);
        System.out.println("o resultado da divisao é = "+resultado4);
    }
    
}
