package co.utp.misiontic2022.c1;

/**
 * Programa para calcular Interes simple y compuesto y hacer una comparacion.
 *
 */
public class Exportacion{
    //---------------------------------------------------------------------------------------------------------------------------------
    //Atributos
    //---------------------------------------------------------------------------------------------------------------------------------

    private int pTiempo;
    private double pCapital;
    private double pInteres;

    //---------------------------------------------------------------------------------------------------------------------------------
    //Metodos
    //---------------------------------------------------------------------------------------------------------------------------------

    public double calcularInteresSimple(){
        var interesSimple = pCapital * pInteres * pTiempo;
        return interesSimple;
    }

    public double calcularInteresCompuesto(){
        var interesCompuesto = pCapital * (Math.pow((1 + pInteres),pTiempo)-1);
        return interesCompuesto;
    }

    /**
     * Metodo para comparar diferencia total de intereses generados para el proyecto.
     * @return respuesta
     */
    public String compararExportacion(int pTiempo, double pCapital, double pInteres){
        if (pTiempo == 0 || pCapital == 0.0 || pInteres == 0.0){
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }
        else{
            this.pTiempo = pTiempo;
            this.pCapital = pCapital;
            this.pInteres = pInteres;
            // Calculo de la diferencia entre tipo de tasas.
            var respuesta = calcularInteresCompuesto() - calcularInteresSimple();
            return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés"+
            " Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + respuesta;
        }
}

    public static void main( String[] args ){
        var calculo = new Exportacion();
        System.out.println( calculo.compararExportacion(12, 1000, 0.10) );
        System.out.println( calculo.compararExportacion(24, 2000, 0) );
    }
}
