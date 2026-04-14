package logica;

import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class Ex31 {

    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        boolean continuar = true;

        int escolha = Integer.parseInt(entradaDados.nextLine());
        while (continuar) {
            System.out.println("\n-------------CALCULADORA--------------");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRACAO");
            System.out.println("3 - MULTIPLICACAO");
            System.out.println("4 - DIVISAO");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            try {
                switch (escolha) {

                    case 1: //soma
                        double soma;
                        System.out.println("Voce escolheu soma (1)");
                        double n1 = entradaDados.nextDouble();
                        System.out.println("");
                        double n2 = entradaDados.nextDouble();
                        System.out.println("");
                        soma = n1 + n2;

                        System.out.println("Resultado da soma: " + soma);
                        break;
                    case 2: //subtracao
                        double subtracao;
                        System.out.println("Voce escolheu subtracao (2)");
                        System.out.println("Digite na ordem decrescente. EX: numero 1= 3 , numero 2= 1.");
                        double ns1 = entradaDados.nextDouble();
                        System.out.println("");
                        double ns2 = entradaDados.nextDouble();
                        System.out.println("");
                        subtracao = ns1 - ns2;

                        System.out.println("Resultado da subtracao: " + subtracao);
                        break;
                    case 3: //multiplicacao
                        double multiplicacao;
                        System.out.println("Voce escolheu multiplicacao (3)");
                        double nm1 = entradaDados.nextDouble();
                        System.out.println("");
                        double nm2 = entradaDados.nextDouble();
                        System.out.println("");
                        multiplicacao = nm1 * nm2;

                        double multiplicacaoArredondada = Math.round(multiplicacao);

                        System.out.println("Resultado da multiplicacao" + multiplicacaoArredondada);
                        break;
                    case 4: //divisao
                        double divisao;
                        System.out.println("Voce escolheu divisao (4)");
                        double nd1 = entradaDados.nextDouble();
                        System.out.println("");
                        double nd2 = entradaDados.nextDouble();
                        System.out.println("");
                        divisao = nd1 / nd2;

                        double divisaoArredondada = Math.round(divisao);

                        System.out.println("Resultado da divisao: " + divisaoArredondada);
                        break;

                    case 0: //sair
                        continuar = false;
                        System.out.println("Calculadora encerrada");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Opção invalida, rode o programa novamente.");
                entradaDados.next();
            }

        }

    }
}
