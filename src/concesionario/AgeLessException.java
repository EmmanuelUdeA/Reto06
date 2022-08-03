
package concesionario;

public class AgeLessException extends Exception{
    public AgeLessException(){
        super("No se puede ingresar edad menor a 18 años");
    }
    
}
