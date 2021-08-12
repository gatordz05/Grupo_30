package co.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Electrodomestico electrodomesticos[] = new Electrodomestico[5];
        electrodomesticos[0] = new Electrodomestico(200.0, 60, 'C');
        electrodomesticos[1] = new Lavadora(150.0, 30);
        electrodomesticos[2] = new Television(500.0, 80, 'E', 42, false);
        electrodomesticos[3] = new Electrodomestico();
        electrodomesticos[4] = new Electrodomestico(600.0, 20, 'D');
        PrecioTotal solucion1 = new PrecioTotal(electrodomesticos);
        solucion1.mostrarTotales();
    }
}
