package nivel1Singleton;

import java.util.ArrayList;

public class Undo {

    //declaracion
    private static Undo instancia;
    private static ArrayList<String> commands = new ArrayList<String>();

    //evita la instancia "new" a cada rato
    private Undo (){

    }

    //con este metodo se obtiene la instancia x el "static" para poder acceder class.getInstancia
    public static Undo getInstancia() {
        if(instancia == null) {
            instancia = new Undo();
        }
        return instancia;
    }

    //metodo para guardar el comando
    public void guardarComando(String comando) {

        commands.add(comando);
    }

    //metodo para mostrar los comandos guardados
    public void listadoComandos() {

        System.out.println(commands);
    }

    //metodo para borrar el ultimo comando a modo de funcion undo (ctrl z)
    public void eliminarComando() {
        if (commands.isEmpty()==false) {
            commands.remove(commands.size()-1);
        }
    }

}
