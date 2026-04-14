
package logica;
import java.util.Scanner;


public class Ex17 {

  
    
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        //
       System.out.println("Digite um valor numerico: ");
       double numero = entradaDados.nextDouble();
        //
        if (numero >= 1){
        System.out.println("o valor é positivo.");
        }
        //
          if (numero == 0){
          System.out.println("o valor é 0.");
          }
        //
            if (numero < 0){
            System.out.println("o valor é negativo.");
            }
        //
    }
    
}
