/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Conversao {
    private double tempCelsius, tempFarenheit;
    
    public Conversao(double tempFarenheit){
        this.tempFarenheit = tempFarenheit;
    }
    
    public void converterFC(){
        tempCelsius = (5*(tempFarenheit-32))/9;
    }
    
    public void mostrarTemp(){
         converterFC();
        System.out.println("Temperatura Celsius:"+tempCelsius);
    }

    public double getTempCelsius() {
        return tempCelsius;
    }

    public void setTempCelsius(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }
    
    
    
}
