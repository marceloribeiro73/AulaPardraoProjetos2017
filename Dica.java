/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Dica {
    
    private double tempCelsius;
    private char sexo;
    
    public Dica(double tempCelsius, char sexo){
        this.tempCelsius = tempCelsius;
        this.sexo = sexo;
    }
    
    public void informarDica(){
        if(sexo=='M' && tempCelsius>=26)
            System.out.println("Machao usar amarelo ouro");
        else
            System.out.println("Mina usar rosa!");
    }
    
    
    
}
