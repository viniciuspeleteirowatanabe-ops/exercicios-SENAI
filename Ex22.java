package logica;
import java.util.Scanner;


public class Ex22 {

    public static void main(String[] args) {
       Scanner entradaDados = new Scanner(System.in);
        /////////
           double salario1 = 1.20;
           double salario2 = 1.15;
           double salario3 = 1.10;
           double salario4 = 1.5;           
           
        /////////
        System.out.println("Digite seu nome: ");
         String nome = entradaDados.nextLine();
         
        System.out.println("Digite sua funcao: ");
         String funcao = entradaDados.nextLine();
         
          System.out.println("Digite o salario: ");
         double salario = entradaDados.nextDouble();
         /////////
         if (salario <= 1280){
             double resultado = salario * salario1;
             System.out.println("Nome: "+ nome);
             System.out.println("Função: "+ funcao);
             System.out.println("Desconto aplicado: "+ salario1);
             System.out.println("Salario anterior: "+ salario);
             System.out.println("seu salario atual é de: " + resultado);
         }
        /////////     
          if (salario >= 1280.01 && salario <= 1700){
             double resultado2 = salario * salario2;
             System.out.println("Nome: "+ nome);
             System.out.println("Função: "+ funcao);
             System.out.println("Desconto aplicado: "+ salario2);
             System.out.println("Salario anterior: "+ salario);
             System.out.println("seu salario atual é de: " + resultado2);
          }
        /////////
             if (salario >= 1700.01 && salario <= 2500){
             double resultado3 = salario * salario3;
             System.out.println("Nome: "+ nome);
             System.out.println("Função: "+ funcao);
             System.out.println("Desconto aplicado: "+ salario3);
             System.out.println("Salario anterior: "+ salario);
             System.out.println("seu salario atual é de: " + resultado3);
             }
        /////////
                if (salario >= 2500.01){
             double resultado4 = salario * salario4;
             System.out.println("Nome: "+ nome);
             System.out.println("Função: "+ funcao);
             System.out.println("Desconto aplicado: "+ salario4);
             System.out.println("Salario anterior: "+ salario);
             System.out.println("seu salario atual é de: " + resultado4);  
                }
                
      }     
     }
    
  
