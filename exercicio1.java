
/**
 *
 * @author Aluno
 */
public class exercicio1 {
    
    public static void main(String[] args) {
        //Valor do chuveiro 01
        int TENSAO = 220;
        int potencia1 = 8500;
        int corrente;
       //Para saber a "quantidade de amperes"
        corrente = potencia1 / TENSAO;
        System.out.println("Para o chuveiro01 o numero de ampares é = "+corrente);
        //Valor do chuveiro 02
        TENSAO = 220;
        int potencia2 = 5000;
        //Para saber a "quantidade de amperes"
        corrente = potencia2 / TENSAO;
        System.out.println("Para o chuveiro02 o numero de ampares é = "+corrente);
        //Valor do chuveiro 03
        TENSAO = 220;
        int potencia3 = 7500;
        //Para saber a "quantidade de amperes"
        corrente = potencia3 / TENSAO;
        System.out.println("Para o chuveiro03 o numero de amperes é = "+corrente);  
   }
}