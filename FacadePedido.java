import javax.swing.JOptionPane;

public class FacadePedido {
	public void gerarPedido(){
		int codPed=Integer.parseInt(JOptionPane.showInputDialog("Codigo do Pedido:"));
		int qtdPed=Integer.parseInt(JOptionPane.showInputDialog("Quantidade de itens: "));
		Pedido oPed = new Pedido(codPed, qtdPed);
		for(int count=0;count<=qtdPed-1;count++){
			oPed.adicionarItem(new ItemPedido(new Produto(Integer.parseInt(JOptionPane.showInputDialog("Cod do Produto")), 
															JOptionPane.showInputDialog("Descrição Produto"), 
															Double.parseDouble(JOptionPane.showInputDialog("Preco do produto"))), 
										Integer.parseInt(JOptionPane.showInputDialog("Quantidade do Produto"))), 
					count);
		}
		oPed.mostrarPedido();
	}
}
