
public class FolhadePagamento {

	public static void main(String[] args) {
		PorComissao oCom1 = new PorComissao("Maria", 19635.32);
		System.out.println("O Funcionario "+ oCom1.getNome() + ", recebera "+ oCom1.getPay()+"\n");
		
		PorHora oHor1 = new PorHora("Guilherme",54.80,162);
		System.out.println("O Funcionario " + oHor1.getNome() + ", recebera "+ oHor1.getPay()+"\n");
		
		PorHoraeComissao oHCom = new PorHoraeComissao("Sofia", 64.63, 145, 82365.10);
		System.out.println("O Funcionario " + oHCom.getNome() + ", recebera "+ oHCom.getPay());
		
	}

}
