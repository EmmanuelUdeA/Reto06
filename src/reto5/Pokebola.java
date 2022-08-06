
package reto5;


public class Pokebola {
    private String tamano;
    private Pokemon pokemon;

   /* public Pokebola(int numTamano, Pokemon pokemon) {
        //this.setTamano(numTamano);
        //this.pokemon = pokemon;
    }*/

    public Pokebola() {
    }
    

    public String getTamano() {
        return tamano;
    }

    public void setTamano(int optTamano) {

        switch (optTamano){
            case 1:{
                this.tamano = "Pequeña";
                System.out.println("Usted eligió la opcion 1, pokebola " + tamano);                
                break;
            }
            case 2:{
                this.tamano = "Mediana";
                System.out.println("Usted eligió la opcion 2, pokebola " + tamano);                
                break;
            }
            case 3:{                
                this.tamano = "Grande";
                System.out.println("Usted eligió la opcion 3, pokebola " + tamano);
                break;
            }
            default: {
                System.out.println("Opcion incorrecta, por defecto se selecciona pequeña");
                this.tamano = "Pequeña";
            }
        }
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    
}
