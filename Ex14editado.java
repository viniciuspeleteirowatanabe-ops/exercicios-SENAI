package logica;

import javax.swing.JOptionPane;

public class Ex14editado {
    public static void main(String[] args) {
        
        // O loop executará exatamente 3 vezes
        for (int i = 1; i <= 3; i++) {
            JOptionPane.showMessageDialog(null, "Iniciando Calculadora - Rodada " + i + " de 3");

            double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

            double soma = numero1 + numero2;
            double sub  = numero1 - numero2;
            double mult = numero1 * numero2;
            double div  = numero1 / numero2;

            String resultado = String.format("""
               Resultados da rodada %d:
                Soma: %.2f
                 Subtra\u00e7\u00e3o: %.2f
                   Multiplica\u00e7\u00e3o: %.2f
                     Divis\u00e3o: %.2f""", 
                i, soma, sub, mult, div
            );

            JOptionPane.showMessageDialog(null, resultado);
        }
        
        JOptionPane.showMessageDialog(null, "Fim do lote de cálculos.");
    }
}