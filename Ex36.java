package logica;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author vinicius
 */
public class Ex36 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] notaAluno = new double[5];

        System.out.println("--- Sistema de Entrada de Notas ---");

        for (int i = 0; i < notaAluno.length; i++) {
            boolean entradaValida = false;

            do {
                try {
                    System.out.print("Digite a nota do aluno (0 a 10): ");
                    double nota1 = scan.nextDouble();

                    System.out.print("Digite a nota do aluno (0 a 10): ");
                    double nota2 = scan.nextDouble();

                    System.out.print("Digite a nota do aluno (0 a 10): ");
                    double nota3 = scan.nextDouble();

                    System.out.print("Digite a nota do aluno (0 a 10): ");
                    double nota4 = scan.nextDouble();

                    System.out.print("Digite a nota do aluno (0 a 10): ");
                    double nota5 = scan.nextDouble();

                    if (nota1 >= 0.0 && nota1 <= 10.0) {
                        notaAluno[i] = nota1;
                        entradaValida = true;
                    } else {
                        System.out.println("Erro: A nota deve ser entre 0 e 10.");
                    }
                    if (nota2 >= 0.0 && nota2 <= 10.0) {
                        notaAluno[i] = nota2;
                        entradaValida = true;
                    } else {
                        System.out.println("Erro: A nota deve ser entre 0 e 10.");
                    }
                    if (nota3 >= 0.0 && nota3 <= 10.0) {
                        notaAluno[i] = nota3;
                        entradaValida = true;
                    } else {
                        System.out.println("Erro: A nota deve ser entre 0 e 10.");
                    }
                    if (nota4 >= 0.0 && nota4 <= 10.0) {
                        notaAluno[i] = nota1;
                        entradaValida = true;
                    } else {
                        System.out.println("Erro: A nota deve ser entre 0 e 10.");
                    }
                    if (nota5 >= 0.0 && nota5 <= 10.0) {
                        notaAluno[i] = nota5;
                        entradaValida = true;
                    } else {
                        System.out.println("Erro: A nota deve ser entre 0 e 10.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida! Digite apenas números (use vírgula para decimais).");
                    scan.nextLine();
                }

            } while (!entradaValida);
            System.out.println("\nNotas cadastradas com sucesso:");
            for (double nota : notaAluno) {
                System.out.print("[nota do aluno: "+nota);
            }
        }
    }
}
