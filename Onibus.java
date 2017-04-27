/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionamento;

/**
 *
 * @author rpassos
 */
public class Onibus {
 
    private String linha;
    private int numeroLinha;
    private Passageiro passageiros[];
    
    public Onibus(String l, int nl, int qtde){
        linha = l;
        numeroLinha = nl;
        passageiros = new Passageiro[qtde];
    }
    
    public void adicionarPassageiro(){
        
        for(int i=0;i<passageiros.length;i++){
            passageiros[i] = new Passageiro("NOME"+i,(169+i)/100.);
        }
        
    }
    
    public void mostrarOnibus(){
        
        System.out.println("Linha:"+linha+"\tN.:"+numeroLinha);
        System.out.println("----------------------------------------");
        for(int i=0;i<passageiros.length;i++){
            passageiros[i].imprimirDadosPassageiro();
        }
        
        
        
    }
    
}
