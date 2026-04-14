package logica;

import javax.swing.JOptionPane;

public class Ex13editado {
    public static void main(String[] args) {
        int resposta;

        do {
            String leituraC = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:");
            double c = Double.parseDouble(leituraC);

            double fahrenheit = c * 1.8 + 32;

            JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + fahrenheit);

            // Pergunta se quer continuar (0 é Sim, 1 é Não)
            resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outra conversão?");
            
        } while (resposta == JOptionPane.YES_OPTION);
    }
}