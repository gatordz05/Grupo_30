package co.utp.misiontic2022.c2;

public class Lavadora extends Electrodomestico{
    
    private Integer CARGA_BASE = 5;
    private Integer carga;
    
    public Lavadora (){
        super();
        carga = CARGA_BASE;
    }

    public Lavadora (double precioBase, Integer peso){
        super(precioBase, peso);
        carga = CARGA_BASE;
    }

    public Lavadora (double precioBase, Integer peso, char consumoW, Integer carga){
        super(precioBase, peso, consumoW);
        this.carga = carga;
    }

    public double calcularPrecio(){

    }
}
