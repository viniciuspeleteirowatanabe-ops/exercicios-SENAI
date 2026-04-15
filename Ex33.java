package logica;

import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class Ex33 {

    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int a = entradaDados.nextInt();

        System.out.println("Digite o valor de B");
        int b = entradaDados.nextInt();

        double basis1 = a;
        double basis2 = b;
        double expoente = 2;
        double hipotenusa1;
        double hipotenusa2;
        double potencia1 = Math.pow(basis1, expoente);
        double potencia2 = Math.pow(basis2, expoente);
        hipotenusa1 = potencia1 * potencia2;
        hipotenusa2 = Math.sqrt(hipotenusa1);
        System.out.println("O resultado é: " + hipotenusa2);
    }

}
