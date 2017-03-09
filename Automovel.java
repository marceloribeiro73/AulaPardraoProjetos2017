
public class Automovel extends Veiculo {
	
	protected double qtdOleo;
	
	public Automovel(double combustivel){
		this.qtdOleo = combustivel;
	}
	
	public double acelerar(double velocidade){
		if(qtdOleo > 0){
			veloAtual =+ velocidade;
			qtdOleo = qtdOleo - (velocidade / 100);
			return velocidade;
		}else {
			System.out.println("Automovel sem combustivel");
			return veloAtual;
			
		}
			
	}
	
	public void parar() {
		this.veloAtual = 0;
	}
	
	public void mudarOleo(double litros){
		this.qtdOleo =+ litros;
	}
}
