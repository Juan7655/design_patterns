package Patterns.Singleton;

/**
 * Created by JuanDavid on 26/10/16.
 */

public class Cliente {

    private Servidor server;

    public Cliente() {
        server = Servidor.getInstancce();

        for (int i = 0; i < 20; i++)
            server.addNewSong("aa" + i, "bb" + i, "cc" + i, "dd" + i);

        Cancion cancion = server.buscarPorTitulo("dd15");
        cancion.play();
    }
}
