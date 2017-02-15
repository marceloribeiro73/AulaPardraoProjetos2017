/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_padpro_02;

/**
 *
 * @author 11151101605
 */
public class Empregado implements Pagamento{
    private String sFistName;
    private String sLastName;
    private String sMatricula;
    private double dSalario;

    public Empregado(String sFistName, String sLastName, String sMatricula, double dSalario) {
        this.sFistName = sFistName;
        this.sLastName = sLastName;
        this.sMatricula = sMatricula;
        this.dSalario = dSalario;
    }

    public String getsFistName() {
        return sFistName;
    }

    public String getsLastName() {
        return sLastName;
    }

    public String getsMatricula() {
        return sMatricula;
    }

    public double getdSalario() {
        return dSalario;
    }

    public double getTotalPagamento() {
        return dSalario;
    }
   
    
    
    
}
