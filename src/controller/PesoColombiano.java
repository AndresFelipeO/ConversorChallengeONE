package controller;

public class PesoColombiano extends Moneda{
    /**
     * Contructor que inicializa la funcion que llenara los valores de las divisas
     */
    public PesoColombiano(){
       valorIntercambio();
    }

    @Override
    protected void valorIntercambio() {
        intercambioPaises.put("Dolar", 4864.72d);
        intercambioPaises.put("Euro", 5166.96d);
        intercambioPaises.put("Libras Esterlinas", 5824.02);
        intercambioPaises.put("Yen Japones", 35.56d);
        intercambioPaises.put("Won sur-coreano", 3.70d);
    }  
}
