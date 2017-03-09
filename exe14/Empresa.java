package exe14;

public abstract class Empresa {
	
	private String sNome;
	private String sEndereco;
	private String sCidade;
	private String sEstado;
	private String sCep;
	private String sFone;
	
	public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone){
		this.sNome = nome;
		this.sEndereco = endereco;
		this.sCidade = cidade;
		this.sEstado = estado;
		this.sCep  = cep;
		this.sFone = fone;
	}
	
	public Empresa(){}
	
	
	
}
