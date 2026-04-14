package logica;
import java.util.Scanner;

public class Ex18 {

 
    public static void main(String[] args) {
      Scanner entradaDados = new Scanner(System.in);
      
      System.out.println("Digite a quantidade de macas: ");
      int quantidade = entradaDados.nextInt();
      //
      if (quantidade >= 12 );{
         float quantidadecd = quantidade * 0.30f;
         System.out.println("O valor das macas e de: " + quantidadecd);
    }
      if (quantidade < 12);{
          float quantidadesd = quantidade * 0.25f;
          System.out.println("o valor das macas e de: " + quantidadesd);
        }
    }
  }
  


