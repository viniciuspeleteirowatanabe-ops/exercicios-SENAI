package logica;
import javax.swing.JOptionPane;

public class Ex29 {

    
    public static void main(String[] args) {
        int continuar;
     
        
do{ 
    try{
          String aux = JOptionPane.showInputDialog(null,"Digite seu nome");
            JOptionPane.showMessageDialog(null,"Nome digitado: " + aux);
          
          aux = JOptionPane.showInputDialog(null,"Digite seu peso");
     int peso = Integer.parseInt(aux);  
    
          aux = JOptionPane.showInputDialog(null,"Digite sua altura");
     int altura = Integer.parseInt(aux);    
     

     double imc;
    
    imc= peso / (altura * altura);
    
    
     if (imc <=18.5);{
    System.out.println("Você esta abaixo do seu peso ideal!");
    }
   
     if (imc >=18.51 && imc <=24.9);{
    System.out.println("Parabéns, você esta e mseu peso normal!");
    }
    
     if (imc >= 25 && imc <= 29.9);{
    System.out.println("Você esta acima do seu peso (sobrepeso)");
    }
   
     if (imc >= 30 && imc<= 34.9);{
    System.out.println("Obesidade grau 1");
    }
 
     if (imc >= 35 && imc <= 39.9);{
         System.out.println("Obesidade grau 2");
    }
   
     if (imc > 40);{
         System.out.println("Obesidade grau 3");
    }

    }catch(java.lang.NumberFormatException e){
          System.out.println("Erro: digite o apenas o numero");
      }
  // Pergunta se quer continuar (0 = Sim, 1 = Não)

    continuar = JOptionPane.showConfirmDialog(null, "Deseja rodar o programa novamente?", "Confirmação", JOptionPane.YES_NO_OPTION);

        } while (continuar == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Programa finalizado.");
   
    }  

}

