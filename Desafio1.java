package logica;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Desafio1 {


    public static void main(String[] args) {
          Scanner entradaDados = new Scanner(System.in);
          
          String nome;
          double frequenciaminima = 75;
          double faltas;
          double notaf;
          double notaff;
          double dias = 200;
////////
         System.out.println("Digite o nome do aluno");
         String n = entradaDados.nextLine();
         
         System.out.println("Digite quantas faltas o aluno tem");
         double fa = entradaDados.nextDouble();
          
          System.out.println("Digite a nota de portugues do aluno");
         double p = entradaDados.nextDouble();
         
         System.out.println("Digite a nota de matematica do aluno");
         double m = entradaDados.nextDouble();
         
         System.out.println("Digite a nota de historia do aluno");
         double h = entradaDados.nextDouble();
         
        System.out.println("Digite a nota de artes do aluno");
         double a = entradaDados.nextDouble();
          
          System.out.println("Digite a nota de educação fisica do aluno");
          double e = entradaDados.nextDouble();
////////
      notaf = p + m + h + a + e;
      notaff = notaf / 5;
      ////////
      if (fa >= 50 || notaff <= 50){
          System.out.println("nome do aluno: " + n);
          System.out.println("Certificado negado");
   }else{
          System.out.println("nome do aluno: " + n);
          System.out.println("Aprovação para certificação");
      }
      
    }
    
}
