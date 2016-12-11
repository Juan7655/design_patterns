package Patterns.Flyweight;

import android.util.Log;

/**
 * Created by JuanDavid on 26/10/16.
 */

public class Cliente {

    private final EmpleadoFactory factory = new EmpleadoFactory();

    public Cliente() {
        Empleado e1 = factory.getEmpleado("Administrador"),
        e2 = factory.getEmpleado("Finanzas");

        Log.i("cliente flyweight", e1.getTipoEmpleado() + " - " +e2.getTipoEmpleado());
    }
}
