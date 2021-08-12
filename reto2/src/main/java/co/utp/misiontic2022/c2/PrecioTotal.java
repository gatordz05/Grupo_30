package co.utp.misiontic2022.c2;

public class PrecioTotal {
    
    private double totalElectrodomesticos;
    private double totalLavadoras;
    private double totalTelevisores;
    Electrodomestico[] listaElectrodomesticos;

    public PrecioTotal(Electrodomestico[] pElectrodomesticos){
        this.listaElectrodomesticos = pElectrodomesticos;
        totalElectrodomesticos = 0.0;
        totalLavadoras = 0.0;
        totalTelevisores = 0.0;
    }

    public void mostrarTotales(){

        for(Electrodomestico lista: listaElectrodomesticos){
            if (lista instanceof Electrodomestico){
                totalElectrodomesticos += lista.calcularPrecio();
                System.out.println("e");
            }if (lista instanceof Lavadora){
                totalLavadoras += lista.calcularPrecio();
                System.out.println("L");
            }if (lista instanceof Television){
                totalTelevisores += lista.calcularPrecio();
                System.out.println("T");
            }
        }
        System.out.println("La suma del precio de los electrodomésticos es de " + totalElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de " + totalLavadoras);
        System.out.print("La suma del precio de las televisiones es de " + totalTelevisores);
    }
}
