package logica;

import javax.swing.JOptionPane;

public class Ex07editado {
    public static void main(String[] args) {
        String nome = "";
        
        // Repete enquanto o nome digitado não for "sair"
        while (!nome.equalsIgnoreCase("sair")) {
            nome = JOptionPane.showInputDialog("Digite o seu nome (ou 'sair' para encerrar):");
            
            if (nome == null || nome.equalsIgnoreCase("sair")) {
                break; 
            }

            String leituraAno = JOptionPane.showInputDialog("Digite o ano em que você nasceu:");
            int anoDeNascimento = Integer.parseInt(leituraAno);

            int idadeAproximada = 2026 - anoDeNascimento;

            String mensagem = "Nome: " + nome + "\nA idade aproximada é de: " + idadeAproximada + " anos";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}