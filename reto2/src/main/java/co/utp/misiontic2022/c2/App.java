package co.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Electrodomestico electrodomesticos[] = new Electrodomestico[10];
        electrodomesticos[0] = new Electrodomestico(200.0, 60, 'C');
        electrodomesticos[1] = new Lavadora(150.0, 30);
        electrodomesticos[2] = new Television(500.0, 80, 'E', 42, false);
        electrodomesticos[3] = new Electrodomestico();
        electrodomesticos[4] = new Electrodomestico(600.0, 20, 'D');
        electrodomesticos[5] = new Lavadora(300.0, 40, 'Z', 40);
        electrodomesticos[6] = new Television(250.0, 70);
        electrodomesticos[7] = new Lavadora(400.0, 100, 'A', 15);
        electrodomesticos[8] = new Television(200.0, 60, 'C', 30, true);
        electrodomesticos[9] = new Electrodomestico(50.0, 10);
        PrecioTotal solucion1 = new PrecioTotal(electrodomesticos);
        solucion1.mostrarTotales();
    }
}
