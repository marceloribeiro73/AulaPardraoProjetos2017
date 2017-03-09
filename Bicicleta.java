
public class Bicicleta extends Veiculo{
	
	public double acelerar(double velocidade) {
		veloAtual += velocidade;
		return veloAtual;
	}
	public void parar(){
		veloAtual = 0;
	}
}
