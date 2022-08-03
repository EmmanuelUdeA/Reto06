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
public class Motor {
    
    public Motor(int cilindraje, String marca, String referencia, double peso, String descripcion) throws NegativeWeightEngineException{
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.referencia = referencia;
        this.descripcion = descripcion;
        
        if (peso < 0){
            throw new NegativeWeightEngineException();
        }else{
            this.peso = peso;
        } 
    }
    
    private int cilindraje;
    private String marca;
    private String referencia;
    private double peso;
    private String descripcion;

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
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

    public void setPeso(double peso) throws NegativeWeightEngineException{       
        
        if (peso < 0){
            throw new NegativeWeightEngineException();
        }else{
            this.peso = peso;
        }   
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }  

 }