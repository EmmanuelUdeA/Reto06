
package reto5;


public class Blastoise extends Pokemon {
    
    public Blastoise(String nombre,byte nivel, int puntajeSalud){
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
        System.out.println("¡¡Blastoise!!");
    }
}
