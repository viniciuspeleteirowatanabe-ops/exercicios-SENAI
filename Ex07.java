package logica;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Classes da entrada de dados
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entradaDados.nextLine();
        //
        System.out.println("Digite o ano em que voce nasceu: ");
        int anoDeNascimento = entradaDados.nextInt();
        //
        //Calculo do ano
        int idadeAproximada;
        idadeAproximada = 2026 - anoDeNascimento;

        //Resultado (idade aproximada e nome)
        System.out.println("Nome: " + nome);
        System.out.println("A idade aproximada é de: " + idadeAproximada + " anos");
    }

}
