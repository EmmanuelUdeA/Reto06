
package reto5;

public class Charizard extends Pokemon {
    
    public Charizard(String nombre,byte nivel, int puntajeSalud){
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
        System.out.println("¡¡Charizard!!");
    }
}
