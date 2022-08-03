/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author emmanuel.bustamante
 */
public class Llanta {
    
    private String marca;
    private String referencia;       
    private double peso;

    public Llanta(String marca, String referencia, double peso) throws NegativeWeightTireException{
        this.marca = marca;
        this.referencia = referencia;
        
        if (peso < 0){
            throw new NegativeWeightTireException();
        }else{
            this.peso = peso;
        }            
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws NegativeWeightTireException{
        if (peso < 0){
            throw new NegativeWeightTireException();
        }else{
            this.peso = peso;
        }        
    }
}
