package nivel2AbstractFactory;

public class FactoryArgentina extends AbtractFactory {

    public FactoryArgentina(String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
    }

    @Override
    public String getTelefono(){
        return "Telefono: +54 " + telefono;
    }

    @Override
    public String getDireccion(){
        return "Direccion: " + direccion + ", Argentina.";
    }
}
