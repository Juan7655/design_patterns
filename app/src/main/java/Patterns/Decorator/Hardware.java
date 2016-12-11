package Patterns.Decorator;

/**
 * Created by JuanDavid on 26/10/16.
 */

public class Hardware implements Proyecto {

    private String nombre;

    public Hardware(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getName() {
        return this.nombre;
    }

    @Override
    public void setName(String nombre) {
        this.nombre = nombre;
    }
}
