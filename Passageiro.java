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
public class Passageiro {
    
    private String nome;
    private double altura;
    
    public Passageiro(String n, double a){
        nome = n;
        altura = a;
    }
    
    public void imprimirDadosPassageiro(){
        System.out.println("nome:"+nome+"\t altura:"+altura);
    }
}
