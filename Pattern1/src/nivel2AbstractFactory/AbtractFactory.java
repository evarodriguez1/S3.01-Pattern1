package nivel2AbstractFactory;

public class AbtractFactory implements IFactory {

    String nombre;
    String telefono;
    String direccion;

    public AbtractFactory(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion= direccion;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getDireccion(){
        return direccion;
    }
}
