
package reto5;


public class Squirtle extends Pokemon{
    
    public Squirtle(String nombre,byte nivel, int puntajeSalud){
        setNombre(nombre);
        setNivel(nivel);
        setPuntajeSalud(puntajeSalud);
    }  

    @Override
    public Pokemon evolucionar() {
        Pokemon wartortle = new Wartortle(this.getNombre(),this.getNivel(),this.getPuntajeSalud());
        return wartortle;
    }

    @Override
    public void gritar() {
        System.out.println("¡¡Squirtle!!");
    }
    
}
