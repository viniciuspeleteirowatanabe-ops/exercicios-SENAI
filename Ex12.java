package logica;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Ex12 {
     
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        //valores
        System.out.println("Seu salario bruto é de: ");
        double adiantamento = 0.40;
        double desconto = 0.8;
        double salario = 2000;
        double resultado;
        //Calculo
         resultado = (salario*0.48);
        //final
        System.out.println("o desconto do adiantamento do seu salario é de = "+adiantamento);
        System.out.println("o desconto do seu salario é de = "+desconto);        
        System.out.println("O valor liquido do seu salario é de = "+resultado);
    }
    
}
