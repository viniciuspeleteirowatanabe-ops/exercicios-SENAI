package logica.desafio3;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author Vinicius
 */
public class Desafio3 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println("---CALCULADORA---");
        OpMatematicas opm = new OpMatematicas();
        boolean continuar = true;

        UIManager.put("OptionPane.background", Color.DARK_GRAY);
        UIManager.put("Panel.background", Color.LIGHT_GRAY);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("Button.background", Color.black);
        UIManager.put("Button.Foreground", Color.WHITE);

        //imagens
        ImageIcon iconedivisao = new ImageIcon("C:/Usuários/Aluno/Downloads/Divide.png");
        ImageIcon iconesoma = new ImageIcon("C:/Usuários/Aluno/Downloads/adicao.png");
        ImageIcon iconematematica = new ImageIcon("C:/Usuários/Aluno/Downloads/calculator-simple.png");
        ImageIcon iconemultiplicacao = new ImageIcon("C:/Usuários/Aluno/Downloads/cr0ss.png");
        ImageIcon iconesubtracao = new ImageIcon("C:/Usuários/Aluno/Downloads/minus.png");

        do {

            String input1 = (String) JOptionPane.showInputDialog(null,
                    "<html><b>Digite o primeiro numero<b></html>",
                    "numero",
                    JOptionPane.INFORMATION_MESSAGE,
                    iconematematica,
                    null,
                    ""
            );
            opm.num1 = Integer.parseInt(input1);
            String input2 = (String) JOptionPane.showInputDialog(null,
                    "<html><b>Digite o segundo numero<b></html>",
                    "numero",
                    JOptionPane.INFORMATION_MESSAGE,
                    iconematematica,
                    null,
                    ""
            );
            opm.num2 = Integer.parseInt(input2);

            Object[] opcoes1 = {"soma", "subtracao", "multiplicacao", "divisao"};
            Object operacao = JOptionPane.showInputDialog(null,
                    "Escolha uma <html><b>operação<b></html>",
                    "Calculadora",
                    JOptionPane.PLAIN_MESSAGE,
                    iconematematica,
                    opcoes1,
                    opcoes1[0]);

            int opcao = 0;
            double resultado;
            switch (opcao) {
                case 0 -> {
                    opm.soma(opm.num1, opm.num2);
                    resultado = opm.soma(opm.num1, opm.num2);
                    JOptionPane.showMessageDialog(null,
                            "<html><b>Resultado: <b></html>" + resultado,
                            "Soma",
                            JOptionPane.PLAIN_MESSAGE,
                            iconesoma
                    );

                }
                case 1 -> {

                    opm.subtracao(opm.num1, opm.num2);
                    resultado = opm.subtracao(opm.num1, opm.num2);
                    JOptionPane.showMessageDialog(null,
                            "<html><b>Resultado: <b></html>" + resultado,
                            "Subtracao",
                            JOptionPane.PLAIN_MESSAGE,
                            iconesubtracao
                    );

                }
                case 2 -> {
                    opm.multiplicacao(opm.num1, opm.num2);
                    resultado = opm.multiplicacao(opm.num1, opm.num2);
                    JOptionPane.showMessageDialog(null,
                            "<html><b>Resultado: <b></html>" + resultado,
                            "Multiplicação",
                            JOptionPane.PLAIN_MESSAGE,
                            iconemultiplicacao
                    );
                }

                case 3 -> {
                    opm.divisao(opm.num1, opm.num2);
                    resultado = opm.divisao(opm.num1, opm.num2);
                    JOptionPane.showMessageDialog(null,
                            "<html><b>Resultado: <b></html>" + resultado,
                            "Divisão",
                            JOptionPane.PLAIN_MESSAGE,
                            iconedivisao
                    );
                }
            }

            try {

                Object[] opcoes2 = {"SIM", "NAO"};
                Object sair = (Object[]) JOptionPane.showInputDialog(null,
                        "Deseja <html><b>sair?<b></html>",
                        "Calculadora",
                        JOptionPane.INFORMATION_MESSAGE,
                        iconemultiplicacao,
                        opcoes2,
                        opcoes2[0]);

                if (opcoes2 == null || !opcoes2.equals("SIM")) {
                    continuar = false;
                }
            } catch (java.lang.NumberFormatException | java.lang.ClassCastException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "<html><b>Feche a aba<b></html>",
                        "Calculadora",
                        JOptionPane.PLAIN_MESSAGE,
                        iconemultiplicacao
                );
            }
        } while (continuar = true);

    }

}
