
package logica;
import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
         String nome = entradaDados.nextLine();
        //
        System.out.println("Digite sua idade: ");
        double idade = entradaDados.nextDouble();
        //
        if (idade <= 10){
             System.out.println("nome: " + nome );
            System.out.println("Categoria: infantil");
        }
        //
        if (idade >= 11 && idade <=18) {
            System.out.println("nome: " + nome );
            System.out.println("Categoria: juvenil");
        }
        //
        if (idade >= 19 && idade <=40) {          
            System.out.println("nome: " + nome );
            System.out.println("Categoria: profissional");
        }
       //
        if (idade >= 41){
            System.out.println("nome: " + nome );
            System.out.println("Categoria: master");
        }
    
    }
    
}
