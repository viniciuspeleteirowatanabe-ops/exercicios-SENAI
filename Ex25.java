package logica;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Ex25 {

    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o nome da cidade (com letra minuscula)");
        String cidade = entradaDados.nextLine();
        

        switch (cidade) {

            case "jundiai" + "santos" + "maua" + "diadema" -> System.out.println("É uma cidade de São Paulo");

            case "monte verde" + "camanducaia" + "pouso alegre" -> System.out.println("É uma cidade de Minas Gerais");      
        
            default -> System.out.println("Cidade não listada no programa!");
            

        }
        
    }
}
