
// ALEJANDRO BECERRA ACEVEDO
// EMMANUEL BUSTAMANTE VALBUENA

package reto5;


public class Reto5 {
    public static void main(String[] args) {

        Pokemon otroPokemon = new Charmander("fuego",(byte)75,200);
        Pokemon miPokemon = new Pikachu("fito",(byte)50,100);
        Pokemon ultimoPokemon = new Blastoise("tortuga",(byte)70,150);
        Pokemon evolucionado2 = new Charmeleon ("llamitas",(byte)100,400);
        Pokemon evolucionado;
        Pokemon evolucionado1 = null;

        System.out.println(miPokemon.getNombre() + " " + miPokemon.getNivel() + " " + miPokemon.getPuntajeSalud() + " ");
        System.out.println(otroPokemon.getNombre() + " " + otroPokemon.getNivel() + " " + otroPokemon.getPuntajeSalud() + " ");
        
        miPokemon.gritar();  
        
        otroPokemon.gritar();
        
        
        Pokebola miPokebola = new Pokebola();
        Pokebola otraPokebola = new Pokebola();
        
        
        miPokebola.setTamano(1);
        miPokebola.setPokemon(miPokemon);
        miPokebola.getPokemon().gritar();
        
        try{
            evolucionado = otroPokemon.evolucionar();
            evolucionado.gritar();            
        }catch (NoEvolucionaException e){
            System.out.println(e.getMessage());
        }
     
        try {
            evolucionado1 = evolucionado2.evolucionar();
            evolucionado1.gritar();           
        }catch (NoEvolucionaException e){
            System.out.println(e.getMessage());
        }

        
        otraPokebola.setTamano(3);
        otraPokebola.setPokemon(evolucionado1);
        otraPokebola.getPokemon().gritar();
        
        otroPokemon.gritar();

        System.out.println(miPokebola.getPokemon().getNombre() + " " + miPokebola.getPokemon().getNivel() + " " + miPokebola.getPokemon().getPuntajeSalud());
        System.out.println(miPokemon.getNombre() + " " + miPokemon.getNivel() + " " + miPokemon.getPuntajeSalud());
        
        try {   
            evolucionado = ultimoPokemon.evolucionar();
            evolucionado.gritar();
        }catch (NoEvolucionaException e){
            System.out.println(e.getMessage());
        }
    }
    
}
