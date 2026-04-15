package logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class Ex32 {

    public static void main(String[] args) {
        int continuar;
        do {
            int num1 = (int) (Math.random() * 101);
            int num2 = (int) (Math.random() * 101);
            int num3 = (int) (Math.random() * 101);
            int num4 = (int) (Math.random() * 101);
            int num5 = (int) (Math.random() * 101);
            int num6 = (int) (Math.random() * 101);

            System.out.println("----SORTEIO DE NUMEROS DE 1 A 100----");

            JOptionPane.showConfirmDialog(null, "deseja gerar 6 numeros alatorios? ");

            Object[] options = {"Numeros sorteados: " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6};
            JOptionPane.showMessageDialog(null, options);
            continuar = JOptionPane.showConfirmDialog(null, "Deseja gerar os numeros novamente?", "Confirmação", JOptionPane.YES_NO_OPTION);

        } while (continuar == JOptionPane.YES_OPTION);

    }

}
