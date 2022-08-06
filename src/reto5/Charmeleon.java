
package reto5;


public class Charmeleon extends Pokemon {

    
    public Charmeleon(String nombre,byte nivel, int puntajeSalud){
        setNombre(nombre);
        setNivel(nivel);
        setPuntajeSalud(puntajeSalud);
    }  
    
    @Override
    public Pokemon evolucionar() {       
        Pokemon charizard = new Charizard(this.getNombre(),this.getNivel(),this.getPuntajeSalud());
        return charizard;
    }

    @Override
    public void gritar() {
        System.out.println("¡¡Charmeleon!!");
     }
    
}
