
package logica;
import java.util.Scanner;

public class Ex20 {

   
    public static void main(String[] args) {
    Scanner entradaDados = new Scanner(System.in);
    
     System.out.println("digite a nota do primeiro bimestre: ");
     double primeirobi = entradaDados.nextDouble();
    //
     System.out.println("digite a nota do segundo bimestre: ");
     double segundobi = entradaDados.nextDouble();
    // 
     System.out.println("digite a nota do terceiro bimestre: ");
     double terceirobi = entradaDados.nextDouble();
    // 
     System.out.println("digite a nota do quarto bimestre: ");
     double quartobi = entradaDados.nextDouble();
    
//Calculos
    double geral = primeirobi + segundobi + terceirobi + quartobi;
    double media = geral / 4;
//    
  if (media >= 7) {
      System.out.println("Aluno(a) APROVADO(A)");
  }else{
      System.out.println("Aluno(a) REPROVADO(A)");
    
    }
  }
}
