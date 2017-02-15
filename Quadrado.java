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
public class Quadrado implements AreaCalculavel{
    private double dLado;

    public Quadrado(double lado) {
        this.dLado = lado;
    }

    public double getdLado() {
        return dLado;
    }

    public double calcularArea() {
        return dLado*dLado;
    }
    
}
