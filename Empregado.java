
public abstract class Empregado {
	private String sNome;

	public Empregado(String sName) {
		this.sNome = sName;
	}
	public String getNome(){
		return this.sNome;
	}
	public void printPay(double dPay){
		System.out.println(dPay);
	}
	public abstract double getPay();
}
