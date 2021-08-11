package co.utp.misiontic2022.c2;

public class Television extends Electrodomestico{
    
    private Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private Boolean sintonizadorTDT;
    
    public Television (){
        super();
        pulgadas = PULGADAS_BASE;
        sintonizadorTDT = false;
    }

    public Television (double precioBase, Integer peso){
        super(precioBase, peso);
        pulgadas = PULGADAS_BASE;
        sintonizadorTDT = false;
    }

    public Television (double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean sintetizadorTDT){
        super(precioBase, peso, consumoW);
        this.pulgadas = PULGADAS_BASE;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double calcularPrecio(){

    }
}
