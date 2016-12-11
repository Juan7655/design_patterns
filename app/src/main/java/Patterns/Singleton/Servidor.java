package Patterns.Singleton;

import java.util.ArrayList;

/**
 * Created by JuanDavid on 26/10/16.
 */

class Servidor {

    private ArrayList<Cancion> biblioteca = new ArrayList<>();
    private static Servidor server;

    private Servidor() {
    }

    static Servidor getInstancce(){
        if (server == null)
            server = new Servidor();

        return server;
    }

    public void addSong(Cancion cancion){
        biblioteca.add(cancion);
    }

    void addNewSong(String nombre, String ip, String autor, String titulo){
        Cancion cancion = new Cancion(nombre, ip, autor, titulo);
        biblioteca.add(cancion);
    }

    Cancion buscarPorTitulo(String titulo){
        for(Cancion c : biblioteca)
            if(c.getTitulo().equals(titulo))
                return c;

        return null;
    }
}
