package nivel2AbstractFactory;

public class App {

    public static void main(String [] args){

        FactoryEspaña contacto1 = new FactoryEspaña("Ramon Perez","627891299","Carrer de Sants 123, Barcelona");
        FactoryArgentina contacto2 = new FactoryArgentina("Raul Rodriguez","47546282","Avenida Libertad 456, Mar del Plata");

        System.out.println(contacto1.getNombre()+ " || " + contacto1.getTelefono() +" || "+contacto1.getDireccion());
        System.out.println(contacto2.getNombre()+ " || " + contacto2.getTelefono() +" || "+contacto2.getDireccion());

    }
}
