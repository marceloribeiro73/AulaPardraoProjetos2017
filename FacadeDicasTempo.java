import javax.swing.JOptionPane;



public class FacadeDicasTempo {
	//private Conversao oC = new Conversao(75);
	private Conversao oC = new Conversao(Double.parseDouble(JOptionPane.showInputDialog("Inserir Temperatura em Fº: ")));
	private Tempo oT = new Tempo(oC.getTempCelsius());
	private Dica oD = new Dica(oC.getTempCelsius(),'F');
    public void mostrarTemp(){
    	oC.mostrarTemp();    	
    }
    public void mostrarTempo(){
    	oT.mostrarTempo();
    }
    public void mostrarDica(){
    	oD.informarDica();
    }
}
