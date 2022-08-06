/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author emmanuel.bustamante
 * Alejandro Becerra
 */
public class Concesionario {

    public static void main(String[] args) {

        Llanta nuevaLlanta;
        Motor nuevoMotor;
        Vendedor nuevoVendedor;
        Vehiculo nuevoVehiculo;

        try {
            nuevaLlanta = new Llanta("goodgear", "tre", -20);
            //nueva.setPeso(-20);
        } catch (NegativeWeightTireException e) {
            System.out.println(e.getMessage());
        }
        try {
            nuevoMotor = new Motor(100, "goodgear", "tre", -40, "Motor xy");
        } catch (NegativeWeightEngineException e) {
            System.out.println(e.getMessage());
        }
        try {
            nuevoVendedor = new Vendedor(1001018117, "Emmanuel", "Bustamante", 17, (double) 50000000, 2026, "Vendedoxy");
        } catch (AgeLessException e) {
            System.out.println(e.getMessage());
        } catch (AgeEntryException e) {
            System.out.println(e.getMessage());

        }
    }
}
