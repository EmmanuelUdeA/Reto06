

package concesionario;


public class AgeEntryException extends Exception{
    
    public AgeEntryException(){
        super("Vendedor no puede tener año de ingreso mayor al año actual");
    }    
}
