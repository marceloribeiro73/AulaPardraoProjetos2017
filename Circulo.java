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
public class Circulo implements AreaCalculavel{
    private double dDiametro;
    private final double dPI = 3.1416;

    public Circulo(double dDiametro) {
        this.dDiametro = dDiametro;
    }

    public double getdDiametro() {
        return dDiametro;
    }

    
    public double calcularArea() {
        return (dDiametro/2.0)*(Math.pow(dPI, 2.0));
    }
    
    
    
}
