
package concesionario;


public class NegativeWeightTireException extends Exception{
    public NegativeWeightTireException(){
        super("El peso del neumático no puede ser inferior a cero");
    }    
}
