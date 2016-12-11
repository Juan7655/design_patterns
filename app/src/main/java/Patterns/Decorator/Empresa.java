package Patterns.Decorator;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by JuanDavid on 26/10/16.
 */

public class Empresa {
    private String nombre;
    private final ArrayList<Proyecto> proyectos = new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

public void metodo(){
        Proyecto p = new Software(new Hardware("holaHard"));
        this.proyectos.add(p);

    String message = "Nombre de la Empresa: "+nombre
            .concat("\n Proyectos: ")
            .concat(String.valueOf(proyectos.size()))
            .concat("\n Primer Proyecto: ")
            .concat(proyectos.get(0).getName());

    Log.i("Empresa - Decorator", message);
    }
}
