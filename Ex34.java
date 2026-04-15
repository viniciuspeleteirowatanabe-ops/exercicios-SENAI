package logica;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class Ex34 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.0");
        double vazio = 0;
        double media1;
        double media2;

        System.out.println("---MEDIA DE TEMPERATURA DA SEMANA--- ");

        System.out.println("Digite a temperatura da segunda-feira:");
        double segunda = scan.nextDouble();

        System.out.println("Digite a temperatura da terça-feira:");
        double terça = scan.nextDouble();

        System.out.println("Digite a temperatura da quarta-feira:");
        double quarta = scan.nextDouble();

        System.out.println("Digite a temperatura da quinta-feira:");
        double quinta = scan.nextDouble();

        System.out.println("Digite a temperatura da sexta-feira:");
        double sexta = scan.nextDouble();

        System.out.println("Digite a temperatura do sabado:");
        double sabado = scan.nextDouble();

        System.out.println("Digite a temperatura do domingo:");
        double domingo = scan.nextDouble();
        //
        double[] temperaturas = {segunda, terça, quarta, quinta, sexta, sabado, domingo};
        media1 = segunda + terça + quarta + quinta + sexta + sabado + domingo;
        media2 = media1 / 7;
        int diasacima = 0;

        double maiortemp = temperaturas[0];
        for (double temp : temperaturas) {
            if (temp > maiortemp) {
                maiortemp = temp;
            }
        }

        for (double temp : temperaturas) {
            if (temp > media2) {
                diasacima++;
            }
        }
        System.out.println("---RESULTADO---");
        System.out.println("Média de temperatura: " + df.format(media2));
        System.out.println("Dias acima da media: " + diasacima);
        System.out.println("Maior temperatura da semana: " + df.format(maiortemp));
    }
}
