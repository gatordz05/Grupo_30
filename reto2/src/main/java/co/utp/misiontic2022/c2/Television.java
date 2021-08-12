package co.utp.misiontic2022.c2;

public class Television extends Electrodomestico{
    
    private Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private Boolean sintonizadorTDT;
    
    // Constructor sin parametros
    public Television (){
        super();
        pulgadas = PULGADAS_BASE;
        sintonizadorTDT = false;
    }

    // Constructor con 2 parametros: precioBase y peso
    public Television (double precioBase, Integer peso){
        super(precioBase, peso);
        pulgadas = PULGADAS_BASE;
        sintonizadorTDT = false;

    }

    // Constructor con 5 parametros: precioBase, peso, consumoW, pulgadas y sintonizadorTDT
    public Television (double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean sintonizadorTDT){
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Metodo que calcula el precio con incremento y retorna total
    public double calcularPrecio(){

        //Definicion del incremento del televisor
        double adicion = 0.0;
        if (sintonizadorTDT == true){
            adicion += 50.0;
        }
        if (pulgadas > 40){
            adicion += (precioBase * 0.3);
        }
        double total = super.calcularPrecio() + adicion;
        return total;
        
    }
}
