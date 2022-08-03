
package concesionario;


public class NegativeWeightEngineException extends Exception{
    public NegativeWeightEngineException(){
        super("El peso del motor no puede ser menor a cero");
    }  
}
