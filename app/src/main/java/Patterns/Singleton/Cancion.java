package Patterns.Singleton;

import android.util.Log;

/**
 * Created by JuanDavid on 26/10/16.
 */

class Cancion {

    private String nombre;
    private String ip;
    private String autor;
    private String titulo;

    Cancion(String nombre, String ip, String autor, String titulo) {
        this.nombre = nombre;
        this.ip = ip;
        this.autor = autor;
        this.titulo = titulo;
    }

    String getTitulo() {
        return titulo;
    }

    void play() {
        String message = this.titulo
                .concat(" - ").concat(this.autor)
                .concat(" - ").concat(this.nombre)
                .concat(" - ").concat(this.ip);

        Log.i("--Playing Song--", "Playing: "+ message);

    }
}
