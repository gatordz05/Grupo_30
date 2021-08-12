package co.utp.misiontic2022.c2;

public class Lavadora extends Electrodomestico{
    
    // Constante
    private final Integer CARGA_BASE = 5;
    // Atributos
    private Integer carga;
    private double adicion = 0;

    // Constructor sin parametros
    public Lavadora (){
        super();
        carga = CARGA_BASE;
    }

    // Constructor con 2 parametros: precioBase y peso
    public Lavadora (double precioBase, Integer peso){
        super(precioBase, peso);
        carga = CARGA_BASE;
    }

    // Constructor con 4 parametros: precioBase, peso, consumoW y carga
    public Lavadora (double precioBase, Integer peso, char consumoW, Integer carga){
        super(precioBase, peso, consumoW);
        this.carga = carga;
    }

    // Metodo que calcula el precio y retorna total
    public double calcularPrecio(){

        // Definicion del incremento de lavadora
        if (carga > 30){
            adicion += 50;
        }
        double total = super.calcularPrecio() + adicion;
        return total;
    }
}
