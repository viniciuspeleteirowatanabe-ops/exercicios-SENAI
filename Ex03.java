 
/*
 * @author Vinicius
 */
public class exercicio3 {
    public static void main(String[] args) {
        //Valores das constantes
        final double COMPRIMENTO = 15.5;
        final double LARGURA = 8.0;
        
        //Calculos
        double area = COMPRIMENTO * LARGURA;
        double perimetro = 2 * (COMPRIMENTO + LARGURA);
        
        
        //aparecerá na tela
        System.out.println("O Resultado do comprimento total do retangulo é de = " +COMPRIMENTO);
        System.out.println("O Resultado da Largura total do retangulo é de = " +LARGURA);
        System.out.println("Ou seja a area do retangulo é de = "+area);
        System.out.println("Ou seja o perimetro do retangulo é de = "+perimetro);
        
        
    }
}
