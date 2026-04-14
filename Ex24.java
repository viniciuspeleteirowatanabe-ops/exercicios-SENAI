
package logica;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Ex24 {

 
 public static void main(String[] args) {
         Scanner entradaDados = new Scanner(System.in); {
         System.out.println("--- Sistema de Agendamento Pet Shop ---");
         System.out.println("Especialidades Disponíveis:");
         System.out.println("1 - Clínica Geral (R$ 100,00)");
         System.out.println("2 - Dermatologia (R$ 150,00)");
         System.out.println("3 - Odontologia (R$ 120,00)");
         
         System.out.print("\nEscolha a opção desejada (1-3): ");
         int opcao = entradaDados.nextInt();
         
         double valorBase = 0;
         boolean opcaoValida = true;
         
         // Atribuição do preço base conforme a escolha
         switch (opcao) {
             case 1 -> valorBase = 100.00;
             case 2 -> valorBase = 150.00;
             case 3 -> valorBase = 120.00;
             default -> opcaoValida = false;
         }
         
         if (opcaoValida) {
             System.out.print("O cliente possui convênio? (S/N): ");
             char convenio = entradaDados.next().toUpperCase().charAt(0);
             
             double valorFinal = valorBase;
             
             // Aplicação do desconto de 20%
             if (convenio == 'S') {
                 valorFinal = valorBase * 0.80;
                 System.out.println("\n>>> Desconto de 20% aplicado com sucesso!");
             }
             
             System.out.printf("O valor total da consulta é: R$ %.2f%n", valorFinal);
         } else {
             System.out.println("\nErro: Opção inválida. Reinicie o programa.");
         }
     }
    }
}
    

