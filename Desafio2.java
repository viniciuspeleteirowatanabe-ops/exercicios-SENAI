package logica;
import java.util.Scanner;
/**
 *
 * @author Vinicius
 */
public class Desafio2 {

    public static void main(String[] args) {
      Scanner entradaDados = new Scanner(System.in);
        double amperes;
        double bitola;
      ////////
      System.out.println("DIGITE A POTENCIA DO EQUIPAMENTO");
       double potencia = entradaDados.nextDouble();
       
      System.out.println("DIGITE A TENSAO DO EQUIPAMENTO");
       double tensao = entradaDados.nextDouble();
      //calculo da quantidade de amperes
      amperes = potencia / tensao;
      
//disjuntores ideais e mensagem na tela 127v
     
       if (potencia >= 100 && potencia <=199 && tensao == 127){
        System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 10A");
        System.out.println("BITOLA RECOMENDADA: 1,5mm²");
       }else if (potencia >= 200 && potencia <=299 && tensao == 127){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 10A");
         System.out.println("BITOLA RECOMENDADA: 1,5mm²");
        }else if (potencia >= 300 && potencia <=500 && tensao == 127){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 10A a 16A");
         System.out.println("BITOLA RECOMENDADA: 2,5mm²");
        }else if (potencia >= 501 && potencia <=700 && tensao == 127){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 16A");
         System.out.println("BITOLA RECOMENDADA: 2,5mm²");
        }else if (potencia >= 701 && potencia <=1200 && tensao == 127){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 16A ou 20A");
         System.out.println("BITOLA RECOMENDADA: 2,5mm²");
        }else if (potencia >= 1201 && potencia <=1500 && tensao == 127){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 20A(C)");
         System.out.println("BITOLA RECOMENDADA: 2,5mm²");
        }else if (potencia >= 1501 && potencia <=2000 && tensao == 127){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 20A");
         System.out.println("BITOLA RECOMENDADA: 2,5mm²");
        }else if (potencia >= 2001 && potencia <=2500 && tensao == 127){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 25A");
         System.out.println("BITOLA RECOMENDADA: 4,0mm²");
        }else if (potencia >= 2501 && potencia <=5500 && tensao == 127){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 16A");
         System.out.println("BITOLA RECOMENDADA: 2,5mm²");
        }
       
//disjuntores ideais e mensagem na tela 220v
        if (potencia >= 100 && potencia <=500 && tensao == 220){
        System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 10A");
        System.out.println("BITOLA RECOMENDADA: 1,5mm²");
       }else if (potencia >= 501 && potencia <=1000 && tensao == 220){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 10A(C)");
         System.out.println("BITOLA RECOMENDADA: 2,5mm²");
        }else if (potencia >= 1001 && potencia <=1400 && tensao == 220){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 10A a 16A(C)");
         System.out.println("BITOLA RECOMENDADA: 2,5mm²");
        }else if (potencia >= 1401 && potencia <=1500 && tensao == 220){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 10A ou 16A(C)");
         System.out.println("BITOLA RECOMENDADA: 2,5mm²");
        }else if (potencia >= 1501 && potencia <=2000 && tensao == 220){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 16A ou 20A");
         System.out.println("BITOLA RECOMENDADA: 2,5mm²");
        }else if (potencia >= 2001 && potencia <=3500 && tensao == 220){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 20A");
         System.out.println("BITOLA RECOMENDADA: 2,5mm²");
        }else if (potencia >= 3501 && potencia <=5500 && tensao == 220){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 32A(B)");
         System.out.println("BITOLA RECOMENDADA: 4,0mm²");
        }else if (potencia >= 5501 && potencia <=7500 && tensao == 220){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 40A");
         System.out.println("BITOLA RECOMENDADA: 6,0mm²");
        }else if (potencia >= 7501 && potencia <= 10000 && tensao == 220){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 50A");
         System.out.println("BITOLA RECOMENDADA: 10mm²");
        }else if (potencia >= 10001 && potencia <= 13800 && tensao == 220){
           System.out.println("potencia digitada:"+ potencia);  
         System.out.println("tensao digitada:"+ tensao);  
           System.out.println("QUANTIDADE DE AMPERES: "+ amperes);
        System.out.println("DISJUNTOR RECOMENDADO: 63A");
         System.out.println("BITOLA RECOMENDADA: 16,0mm²");
        }     
    }
}