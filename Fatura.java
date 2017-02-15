/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_padpro_02;

/**
 *
 * @author 11151101605
 */
public class Fatura implements Pagamento{
    
    private String sNumeroParte;
    private String sDescricaoParte;
    private int iQuantidade;
    private double dPrecoItem;

    public Fatura(String pNumero, String pDescricao, int pQuantidade, double  pPreco) {
        
        this.sDescricaoParte = pDescricao;
        this.sNumeroParte = pNumero;
        this.iQuantidade = pQuantidade;
        this.dPrecoItem = pPreco;
        
    }

    public String getsNumeroParte() {
        return sNumeroParte;
    }

    public String getsDescricaoParte() {
        return sDescricaoParte;
    }

    public int getiQuantidade() {
        return iQuantidade;
    }

    public double getdPrecoItem() {
        return dPrecoItem;
    }

    public double getTotalPagamento() {
        return (iQuantidade*1.0)*dPrecoItem;
    }
    
    
    
    
    
}
