package controller;

import java.util.HashMap;
import java.util.Map;

public abstract class Moneda {

    /**
     * @brief Map de los paises disponibles con su valor de intercambio
     */
    public Map<String,Double> intercambioPaises=new HashMap<>();

    /**
     * @brief quema los valores del hasmap  
     */
    protected abstract void  valorIntercambio();
    
    /**
     * @brief convierte un valor ingresado a su intercambio
     * @param moneda moneda de intercambio
     * @param valorConvertir valor moneda local
     * @param valorIntercambio valor de la moneda en su intercambio
     * @return valor convertido
     */
    public double conversor(double moneda,double valorConvertir, double valorIntercambio){
        return Math.round((valorConvertir*moneda/valorIntercambio) * 100) / 100d;
    }
}
