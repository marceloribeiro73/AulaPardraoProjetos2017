/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Tempo {
    private double tempCelsius;
   
    public Tempo(double tempCelsius)
    {
        this.tempCelsius = tempCelsius;
    }
    
    public void mostrarTempo(){
        if(tempCelsius<=10)
            System.out.println("Esta frio - usar casado!");
        else
        {
            if(tempCelsius>=25)
                System.out.println("Esta calor - usar regata!");
            else
                System.out.println("clima ameno - usar camiseta!");
        }
    }
    
}