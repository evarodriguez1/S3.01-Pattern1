package nivel1Singleton;

public class Main {
    public static void main(String[]args) {

        Undo f = Undo.getInstancia();

        f.guardarComando("ctrl + s");
        f.guardarComando("ctrl + c");
        f.guardarComando("ctrl + v");

        f.eliminarComando();

        Undo s = Undo.getInstancia();

        s.listadoComandos();
    }
}
