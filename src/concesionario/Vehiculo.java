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
public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private Double kilometraje;
    private String color;
    private Double precio; 
    private int anoFabricacion;
    private String descripcion;
    
    
    public Vehiculo(String placa, String modelo, String marca, Double kilometraje, String color, Double precio, int añoFabricacion, String descripcion) throws NegativekilometerException{
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.color = color;
        this.precio = precio;
        this.anoFabricacion = añoFabricacion;
        this.descripcion = descripcion;
        
        if (kilometraje < 0){
            throw new NegativekilometerException();
        }else{
            this.kilometraje = kilometraje;
        }   
    }
    
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) throws NegativekilometerException{
        
        if (kilometraje < 0){
            throw new NegativekilometerException();
        }else{
            this.kilometraje = kilometraje;
        }           
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getAñoFabricacion() {
        return anoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.anoFabricacion = añoFabricacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void usoAutomovil(){
    
        if(kilometraje == 0){
            System.out.println("0 km");
        }else if (kilometraje > 0 && kilometraje <= 1000){
            System.out.println("Nuevo");
        }else if (kilometraje > 1000 && kilometraje <= 20000){
            System.out.println("Casi Nuevo");
        }else if (kilometraje > 20000 && kilometraje <= 100000){
            System.out.println("Usado");
        }else if (kilometraje > 100000){
            System.out.println("Muy Usado");
        }
    }
    
    public void obtenerCategoria(){
        int anoActual = 2022;
        int edadVehiculo = anoActual - anoFabricacion;
        
        if (edadVehiculo == 0){
            System.out.println("Ultimo Modelo");            
        }else if (edadVehiculo > 0 && edadVehiculo <= 2){
            System.out.println("Nuevo");
        }else if (edadVehiculo > 2 && edadVehiculo <= 8){
            System.out.println("Intermedio");
        }else if (edadVehiculo > 8){
            System.out.println("Antiguo");        
        }
    }
}
