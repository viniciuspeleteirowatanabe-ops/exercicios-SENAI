package logica.desafio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class Desafio3 {

    public static void main(String[] args) {
        System.out.println("---CALCULADORA---");
        OpMatematicas opm = new OpMatematicas();
        boolean continuar = true;
        do {

            String input1 = JOptionPane.showInputDialog(null, "Digite o primeiro numero");
            opm.num1 = Integer.parseInt(input1);
            String input2 = JOptionPane.showInputDialog(null, "Digite o segundo numero");
            opm.num2 = Integer.parseInt(input2);

            Object[] opcoes = {"soma", "subtracao", "multiplicacao", "divisao"};
            Object selectedValue = JOptionPane.showInputDialog(null,
                    "Escolha uma operação", "Calculadora",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    opcoes, opcoes[0]);

            int opcao = 0;
            double resultado;
            switch (opcao) {
                case 0: {
                    opm.soma(opm.num1, opm.num2);
                    resultado = opm.soma(opm.num1, opm.num2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

                    break;
                }
                case 1: {
                    opm.subtracao(opm.num1, opm.num2);
                    resultado = opm.subtracao(opm.num1, opm.num2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                }
                case 2: {
                    opm.multiplicacao(opm.num1, opm.num2);
                    resultado = opm.multiplicacao(opm.num1, opm.num2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                }
                case 3: {
                    opm.divisao(opm.num1, opm.num2);
                    resultado = opm.divisao(opm.num1, opm.num2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                }
            }
             Object[] options = {"SIM", "NAO"};
            Object selectedValue = JOptionPane.showInputDialog(null,
                    "Escolha uma operação", "Calculadora",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    opcoes, opcoes[0]);
            
        } while (continuar == true);
    }
}
