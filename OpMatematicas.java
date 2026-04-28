package logica.desafio3;

/**
 *
 * @author Vinicius
 */
public class OpMatematicas {

    //atributos
    public double num1;
    public double num2;
    public double resultado;

    //metodos
    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;

    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;

    }

    public double divisao(double num1, double num2) {

        if (num1 <= 0 && num2 <= 0) {
            System.out.println("ERRO: Divisao por zero! Digite um numero valido.");
        }
        return num1 / num2;
    }

}
