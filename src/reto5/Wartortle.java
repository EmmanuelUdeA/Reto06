
package reto5;

public class Wartortle extends Pokemon{
    
    public Wartortle(String nombre,byte nivel, int puntajeSalud){
        setNombre(nombre);
        setNivel(nivel);
        setPuntajeSalud(puntajeSalud);
    } 
    
    @Override
    public Pokemon evolucionar() {
        Pokemon blastoise = new Blastoise(this.getNombre(),this.getNivel(),this.getPuntajeSalud());
        return blastoise;
    }

    @Override
    public void gritar() {
        System.out.println("¡¡Wartortle!!");
    }
}
