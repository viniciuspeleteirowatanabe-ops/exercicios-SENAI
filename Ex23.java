package logica;
import java.util.Scanner;

public class Ex23 {

    
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
  double imc;
    
        System.out.println("Digite seu peso: ");
    double peso = entradaDados.nextDouble();
    
    System.out.println("Digite sua altura: ");
    double altura = entradaDados.nextDouble();
    
    imc= peso / (altura * altura);
    
    
    if (imc <=18.5);{
    System.out.println("Você esta abaixo do seu peso ideal!");
    }
   
    if (imc >=18.51 && imc <=24.9);{
    System.out.println("Parabéns, você esta e mseu peso normal!");
    }
    
    if (imc >= 25 && imc <= 29.9);{
    System.out.println("Você esta acima do seu peso (sobrepeso)");
    }
   
    if (imc >= 30 && imc<= 34.9);{
    System.out.println("Obesidade grau 1");
    }
 
    if (imc >= 35 && imc <= 39.9);{
         System.out.println("Obesidade grau 2");
    }
   
    if (imc > 40);{
         System.out.println("Obesidade grau 3");
    }
    
    
    
    }
    
}
