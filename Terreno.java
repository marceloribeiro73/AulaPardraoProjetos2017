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
public class Terreno {
    
    public Terreno(double pAltura, double pLargura, double pCasaLargura, double pCasaAltura){
       dAltura = pAltura;
       dLargura = pLargura;
       dArea = dLargura * dAltura;
       oCasa1  = new Casa (pCasaAltura,pCasaLargura);
    }
    
    private double dAltura;
    private double dLargura;
    private double dArea;
    private Casa oCasa1;

    public void CompararTerrenoXCasa(){
        double dAreaLivre = dArea - oCasa1.getdArea();
        
        System.out.println(dAreaLivre >= 0.0 ? "Terreno Livre: "+dAreaLivre : "Valor Invalido: Casa maior que terreno");
        
    }
    

}
