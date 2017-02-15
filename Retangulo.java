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
public class Retangulo implements AreaCalculavel{
    private double dBase;
    private double dAltura;

    public Retangulo(double dBase, double dAltura) {
        this.dBase = dBase;
        this.dAltura = dAltura;
    }

    public double getdBase() {
        return dBase;
    }

    public double getdAltura() {
        return dAltura;
    }

    
    public double calcularArea() {
        return dAltura*dBase;
    }
    
    
}
