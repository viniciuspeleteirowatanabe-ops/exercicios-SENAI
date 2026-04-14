package logica;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Ex15 {
     
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
       
        
      //inicio do sistema
        System.out.println("Bem vindo! Você acabou de abrir sua nova conta bancária!");
     //Primeiro depoito do cliente
        System.out.println("Faça seu primeiro deposito: ");
        double d = entradaDados.nextDouble();
     //valores
        double vin = 0; //Valor inicial
        double saldo = vin + d; //Valor depois do depósito
        
     //mensagem pós depósito
        System.out.println("Parabéns! seu depósito foi feito com sucesso!");
     //saldo atual pós depósito
        System.out.println("Seu saldo agora é de: " +saldo);
        //saque
        System.out.println("Agora, faça um saque");
        double saque = entradaDados.nextDouble();
        saldo = saldo - saque;
        
     //se o saque estiver certo seguir normalmente
        if (saque < d) {
        System.out.println("Seu saque foi efetuado! Agora seu saldo é de = "+saldo);
        }
     //se o saque for acima do saldo recusar
        if (saque > d) {
        System.out.println("O valor do saque é maior que o saldo!!");
         System.out.println("Tente Novamente!");
    
               }
    }
}