/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_padpro_01;

/**
 *
 * @author 11151101605
 */
public class Casa {
    
    public Casa(double pAltura, double pLargura){
        dAltura = pAltura;
        dLargura = pLargura;
        dArea = dLargura * dAltura;
    }

    private double dAltura;
    private double dLargura;
    private double dArea;
        

    public double getdArea() {
        return dArea;
    }    

}
