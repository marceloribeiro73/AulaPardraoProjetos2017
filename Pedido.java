/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Pedido {
 	
	private int codigo;
	private ItemPedido itens[];
	private double valortotalpedido;	
        
        public Pedido (int c,int qtde){
            codigo = c;
            itens = new ItemPedido[qtde];
        }
        
        public void adicionarItem(ItemPedido o,int i){
            itens[i] = o;
        }
        public void mostrarPedido(){
            double soma =0;
            System.out.println("Codigo:"+codigo);
            for(int i =0 ; i<itens.length;i++){
                itens[i].imprimirItemProduto();
                soma = soma + itens[i].getValoritem();
            }
            System.out.println("Total Geral do Pedido:"+soma);
            
            
            
        }
        

    
    
}
