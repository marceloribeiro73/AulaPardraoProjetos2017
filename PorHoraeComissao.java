
public class PorHoraeComissao extends PorHora implements Comissao {
	private double dVendas;

	public PorHoraeComissao(String pName, double pVHora, int pQHoras, double pVendas) {
		super(pName, pVHora, pQHoras);
		setVendas(pVendas);
	}
	public void setVendas(double pVendas){
		this.dVendas = pVendas;
	}
	public double getPay(){
		return (dVendas * TAXADECOMISSAO) + (getValorHora()* getQtdHora());
	}
}
;