package co.utp.misiontic2022.c2;

public class PrecioTotal {
    
    private double totalElectrodomesticos;
    private double totalLavadoras;
    private double totalTelevisores;
    Electrodomestico[] listaElectrodomesticos;

    public PrecioTotal(Electrodomestico[] pElectrodomesticos){
        this.listaElectrodomesticos = pElectrodomesticos;
    }

    public void mostrarTotales(){
        System.out.println("La suma del precio de los electrodomesticos es de " + totalElectrodomesticos);
        System.out.println("La suma del precio de los electrodomesticos es de " + totalLavadoras);
        System.out.print("La suma del precio de los electrodomesticos es de " + totalTelevisores);
    }
}
