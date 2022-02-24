/*
Diseña un parking de 4 vehículos: un coche, una bicicleta, un avión y un barco.
Muestre cómo funciona el patrón Command que implemente los métodos arrancar, acelerar y frenar para cada tipo de vehículo.
 */
package nivel3Command;

public class Main {
    public static void main (String [] args) {

        SuperAction sa = new SuperAction();
        sa.addAction(new Start());
        sa.addAction(new SpeedUp());
        sa.addAction(new Stop());

        ActionsManager am = new ActionsManager();

        Vehicle v = new Vehicle("car");
        Vehicle v1 = new Vehicle("bicycle");
        Vehicle v2 = new Vehicle("plain");
        Vehicle v3 = new Vehicle("bote");

        am.actionEjecution(sa, v);
        System.out.println();
        am.actionEjecution(sa, v1);
        System.out.println();
        am.actionEjecution(sa, v2);
        System.out.println();
        am.actionEjecution(sa,v3);
    }
}
