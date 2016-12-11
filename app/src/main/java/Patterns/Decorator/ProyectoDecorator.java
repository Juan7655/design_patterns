package Patterns.Decorator;

/**
 * Created by JuanDavid on 26/10/16.
 */

abstract class ProyectoDecorator implements Proyecto {
    private Proyecto proyecto;

    ProyectoDecorator(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}
