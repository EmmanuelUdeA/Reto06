
package reto5;


public class Pikachu extends Pokemon {
    
    public Pikachu(String nombre,byte nivel, int puntajeSalud){
        setNombre(nombre);
        setNivel(nivel);
        setPuntajeSalud(puntajeSalud);
    }  

    @Override
    public Pokemon evolucionar() {
        
        Pokemon raichu = new Raichu(this.getNombre(),this.getNivel(),this.getPuntajeSalud());
        return raichu;
    
    }

    @Override
    public void gritar() {
        System.out.println("¡¡Pikachu!!");
    }
    
}
