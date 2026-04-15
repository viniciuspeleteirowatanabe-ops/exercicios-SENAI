package logica;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class Ex35 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = (int) (Math.random() * 101);
        int num2 = (int) (Math.random() * 101);
        int num3 = (int) (Math.random() * 101);
        int num4 = (int) (Math.random() * 101);
        int num5 = (int) (Math.random() * 101);
        int num6 = (int) (Math.random() * 101);
        int num7 = (int) (Math.random() * 101);
        int num8 = (int) (Math.random() * 101);
        int num9 = (int) (Math.random() * 101);
        int num10 = (int) (Math.random() * 101);

        double[] numeros = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
        double[] numerosinv = {num10, num9, num8, num7, num6, num5, num4, num3, num2, num1};

        System.out.println("Valor original: " + Arrays.toString(numeros));
        System.out.println("Valor inverso: " + Arrays.toString(numerosinv));

        System.out.println("Digite um valor para saber se ele esta na lista (1 A 100");
        int numerodig = scan.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numerodig == numeros[i]) {
                System.out.println("O número " + numerodig + " está na lista!");
                encontrado = true;
                break; // Para de procurar assim que achar
            }
        }
        if (!encontrado) {
            System.out.println("O número não foi encontrado.");
        }

    }

}
