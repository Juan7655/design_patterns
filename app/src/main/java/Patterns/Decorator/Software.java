package Patterns.Decorator;

/**
 * Created by JuanDavid on 26/10/16.
 */

public class Software extends ProyectoDecorator {

    private String nombre;
    private String tipoSoftware;

    public Software(Proyecto proyecto, String tipoSoftware) {
        super(proyecto);
        this.tipoSoftware = tipoSoftware;
    }

    public Software(Proyecto proyecto) {
        super(proyecto);
        this.tipoSoftware = "";
    }

    @Override
    public String getName() {
        return this.nombre;
    }

    @Override
    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoSoftware() {
        return tipoSoftware;
    }

    public void setTipoSoftware(String tipoSoftware) {
        this.tipoSoftware = tipoSoftware;
    }
}
