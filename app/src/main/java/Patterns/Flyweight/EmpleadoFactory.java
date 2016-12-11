package Patterns.Flyweight;

import java.util.HashMap;

/**
 * Created by JuanDavid on 26/10/16.
 */

public class EmpleadoFactory {

    private final HashMap<String, Empleado> pool = new HashMap<>();

    public EmpleadoFactory() {
    }

    public Empleado getEmpleado(String tipoEmpleado){
        if(!pool.containsKey(tipoEmpleado)){
            Empleado temp = (tipoEmpleado.equals("Administrador"))?
            new Administrador():
            new Finanzas();

            pool.put(tipoEmpleado, temp);
        }


        return pool.get(tipoEmpleado);
    }
}
