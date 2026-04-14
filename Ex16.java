
package logica;
import java.util.Scanner;

public class Ex16 {

  
    public static void main(String[] args) {
       Scanner entradaDados = new Scanner(System.in);
       //valores
       
       double desconto = 1.15;

       //entrada do valor no sistema
       System.out.println("Valor da compra: ");
       double valor = entradaDados.nextDouble();
       //
       if (valor >= 150){
           double compra = valor * desconto;
       System.out.println("o valor é o suficiente para o desconto! o valor ficou = " + compra);
       }else{
           System.out.println("o valor não é o suficiente para o desconto, o valor da compra é de = " + valor);
           
      
    }
  } 
}
