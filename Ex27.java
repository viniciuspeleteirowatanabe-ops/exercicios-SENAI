package logica;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite um número para ver a tabuada: ");
            int numero = leitor.nextInt();

            System.out.println("\nTabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

            System.out.print("\nDeseja realizar um novo cálculo? (S/N): ");
            continuar = leitor.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("Aplicação finalizada");
        leitor.close();
    }
}