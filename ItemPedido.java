/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ItemPedido {
   private Produto produto;
   private int qtde;
   private double valoritem;
   
   public ItemPedido(Produto p, int q ){
       produto = p;
       qtde = q;
   }
        
   public void imprimirItemProduto(){       
       produto.mostrarProduto();
       valoritem = qtde*produto.getPreco();
       System.out.println("Total Item>>>>"+valoritem);
   }

    public double getValoritem() {
        return valoritem;
    }

    public void setValoritem(double valoritem) {
        this.valoritem = valoritem;
    }
   
   

    
}
