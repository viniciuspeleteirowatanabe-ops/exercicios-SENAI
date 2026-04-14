
package logica;
import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        int numero;

        System.out.println("--- Verificador de Números ---");
        System.out.println("Instrução: Digite 0 para sair do programa.");

        // O laço continuará executando enquanto o número for diferente de zero
        do {
            System.out.print("\nDigite um número inteiro: ");
            numero = entradaDados.nextInt();

            if (numero > 0) {
                System.out.println("O número " + numero + " é POSITIVO.");
            } else if (numero < 0) {
                System.out.println("O número " + numero + " é NEGATIVO.");
            } else {
                System.out.println("Encerrando o programa...");
            }

        } while (numero != 0);

        System.out.println("Programa finalizado com sucesso.");
        entradaDados.close();
    }
}