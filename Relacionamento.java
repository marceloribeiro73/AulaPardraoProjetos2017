import java.util.Spliterator.OfDouble;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Relacionamento {

    public static void main(String[] args) {
        // TODO code application logic here
      
       /* Conversao oC = new Conversao(45);
        oC.mostrarTemp();
        Tempo oT = new Tempo(oC.getTempCelsius());
        oT.mostrarTempo();
        Dica oD = new Dica(oC.getTempCelsius(),'F');
        oD.informarDica();*/
    	
    	/*FacadeDicasTempo oF = new FacadeDicasTempo();
        oF.mostrarDica();
        oF.mostrarTempo();*/
    	
    FacadePedido oFP = new FacadePedido();
    oFP.gerarPedido();
    	
    	
    }
    
}
