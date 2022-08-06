
package reto5;


public class Charmander extends Pokemon {


    public Charmander(String nombre,byte nivel, int puntajeSalud){
        setNombre(nombre);
        setNivel(nivel);
        setPuntajeSalud(puntajeSalud);
    }    
    
    @Override
    public Pokemon evolucionar() {       
        Pokemon charmeleon = new Charmeleon(this.getNombre(),this.getNivel(),this.getPuntajeSalud());
        return charmeleon;
    }

    @Override
    public void gritar() {
        System.out.println("¡¡Charmander!!");
    }    
}
