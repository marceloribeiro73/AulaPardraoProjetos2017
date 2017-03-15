
public class PorHora extends Empregado{
	private double dValorHora;
	private int iQtdHora;
	
	public PorHora(String pName ,double pVHora, int pQHoras) {
		super(pName);
		setDValorHota(pVHora);
		setIQtdHora(pQHoras);
	}
	public void setDValorHota(double pValor){
		this.dValorHora=pValor;
	}
	public void setIQtdHora (int pHoras){
		this.iQtdHora = pHoras;
	}
	public double getValorHora(){
		return dValorHora;
	}
	public int getQtdHora(){
		return iQtdHora;
	}
	public double getPay(){
		return this.dValorHora * this.iQtdHora;
	}
}
