/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Produto {
    private int   codigo;
    private String descricao;
    private double preco;
    
    public Produto(int c, String d, double p){
        codigo = c;
        descricao = d;
        preco = p;
       
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void mostrarProduto(){
        System.out.println("produto:"+descricao+"\tpreco:"+preco);
    }
    
    
}
