package co.utp.misiontic2022.c2;

public class Electrodomestico {
    private Integer PESO_BASE = 5;
    private char CONSUMO_W = 'F';
    private Double PRECIO_BASE = 100.0;
    private Integer peso;
    private char consumoW;
    private double precioBase;

    // Constructor sin parametros
    public Electrodomestico(){
        peso = PESO_BASE;
        consumoW = CONSUMO_W;
        precioBase = PRECIO_BASE;
    }

    // Constructor con parametros precioBase y peso.
    public Electrodomestico(double precioBase, Integer peso){
        this.precioBase = precioBase;
        this.peso = peso;
    }

    // Constructor con los 3 parametros
    public Electrodomestico(double precioBase, Integer peso, char consumoW){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
    }

    public void calcularConsumo (char consumoW){

    }
    public double calcularPrecio (){
        return precioBase + adicion;
    }
}
