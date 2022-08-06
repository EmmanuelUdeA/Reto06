
package reto5;


public class Raichu extends Pokemon{
    
    public Raichu(String nombre,byte nivel, int puntajeSalud){
        setNombre(nombre);
        setNivel(nivel);
        setPuntajeSalud(puntajeSalud);
    }  

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException{   
        throw new NoEvolucionaException();
    }
    
    @Override
    public void gritar() {
        System.out.println("¡¡Raichu!!");
    }
    
}
