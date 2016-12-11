package Patterns.Flyweight;

/**
 * Created by JuanDavid on 26/10/16.
 */

public class Administrador implements Empleado {


    public Administrador() {
    }

    @Override
    public String getTipoEmpleado() {
        return "Administrador";
    }
}
