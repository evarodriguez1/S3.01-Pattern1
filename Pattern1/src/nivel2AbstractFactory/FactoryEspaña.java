package nivel2AbstractFactory;

public class FactoryEspaña extends AbtractFactory{

    public FactoryEspaña(String nombre, String telefono, String direccion) {

        super(nombre, telefono, direccion);
    }

    @Override
    public String getTelefono(){
        return "Telefono: +34 " + telefono;
    }

    @Override
    public String getDireccion(){
        return "Direccion: " + direccion + ", España.";
    }
}
