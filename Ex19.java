
package logica;
import java.util.Scanner;

public class Ex19 {


    public static void main(String[] args) {
       Scanner entradaDados = new Scanner(System.in);

       System.out.println("Digite sua idade: ");
       int idade = entradaDados.nextInt();
       //
       if (idade >= 18){
           System.out.println("O seu voto é obrigatório!");
       }
           if (idade == 70)
               System.out.println("O seu voto é obrigatorio");
       if(idade <=71){
        System.out.println("O seu voto não é obrigatório");
    }
    //    
       if (idade == 16){
        double dezesseis = 18 - 16;
           System.out.println("O seu voto é facultativo, faltam" + dezesseis + "anos para seu voto ser obrigatório");
       }
       //
     if (idade == 17){
        double dezessete = 18 - 17;      
           System.out.println("O seu voto é facultativo, falta" + dezessete + "ano para seu voto ser obrigatório");
       }
         // 
    if (idade <18){
        double restante = 18 - idade;
        System.out.println("faltam " + restante + "anos para você ser apto a votar");
      }
    }
} 


