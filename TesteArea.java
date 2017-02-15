/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testearea;

/**
 *
 * @author 11151101605
 */
public class TesteArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Quadrado oQuad = new Quadrado(3.6);
        System.out.println("Area do Quadrado: "+ oQuad.calcularArea());
        
        Circulo oCir = new Circulo(9);
        System.out.println("Area do Circulo: "+ oCir.calcularArea());
        
        Retangulo oRet = new  Retangulo(12, 3);
        System.out.println("Area do Retangulo: "+ oRet.calcularArea());
    }
    
}
