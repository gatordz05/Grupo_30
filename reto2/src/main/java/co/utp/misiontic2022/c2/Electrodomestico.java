package co.utp.misiontic2022.c2;

// Clase padre
public class Electrodomestico {

    // Constantes
    private final Integer PESO_BASE = 5;
    private final char CONSUMO_W = 'F';
    private final Double PRECIO_BASE = 100.0;
    // Atributos
    private Integer peso;
    private char consumoW;
    public double precioBase;
    private Integer adicion = 0;

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
        consumoW = CONSUMO_W;
    }

    // Constructor con 3 parametros
    public Electrodomestico(double precioBase, Integer peso, char consumoW){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
    }

    // Metodo que calcula el incremento por consumo
    public void calcularConsumo (){
        int i = 0;
        switch (consumoW){
            case 'A':
                adicion += 100;
                i = 1;
                break;
            case 'B':
                adicion += 80;
                i = 1;
                break;
            case 'C':
                adicion += 60;
                i = 1;
                break;
            case 'D':
                adicion += 50;
                i = 1;
                break;
            case 'E':
                adicion += 30;
                i = 1;
                break;
            case 'F':
                adicion += 10;
                i = 1;
                break;
        }
        if (i == 0){
            adicion += 10;
        }
    }

    //Metodo que calcula el incremento por peso
    public void calcularPeso (int peso){
        if (peso >= 0 && peso < 19){
            adicion += 10;
        }else if (peso >= 19 && peso < 49){
            adicion += 50;
        }else if (peso >= 49 && peso < 80){
            adicion += 80;
        }else if (peso >= 80){
            adicion += 100;
        }
    }

    // Metodo que calcula el precio con el incremento y lo retorna
    public double calcularPrecio (){
        calcularConsumo();
        calcularPeso(peso);
        return precioBase + adicion;
    }
}
