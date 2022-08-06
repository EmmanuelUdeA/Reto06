
package reto5;

public abstract class Pokemon {
    private String nombre;
    private byte nivel;
    private int puntajeSalud;
    
    public abstract Pokemon evolucionar() throws NoEvolucionaException;
    public abstract void gritar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getNivel() {
        return nivel;
    }

    public void setNivel(Byte nivel) {
        this.nivel = nivel;
    }

    public int getPuntajeSalud() {
        return puntajeSalud;
    }

    public void setPuntajeSalud(int puntajeSalud) {
        this.puntajeSalud = puntajeSalud;
    }
    
    
}
