
public class PorComissao extends Empregado implements Comissao {
	private double dVendas;
	
	public PorComissao (String pNome, double pVendas){
		super(pNome);
		setVendas(pVendas);
	}
	public void setVendas(double pVendas){
		this.dVendas = pVendas;
	}
	public double getPay(){
		return this.dVendas * TAXADECOMISSAO;
	}
}
