package view;

import controller.Moneda;
import controller.PesoColombiano;

public class App {
	public static void main(String[] args) {
		pruebaConversor();
	}
    /**
     * @brief metodo para probar las conversiones por consola y depuracion
     */
    public static void pruebaConversor(){
        Moneda pesoColom=new PesoColombiano();
        System.out.println("8000  pesos: "+pesoColom.conversor(1,8000, pesoColom.intercambioPaises.get("Dolar"))+" dolares");
        System.out.println("1.64 dolares: "+pesoColom.conversor(pesoColom.intercambioPaises.get("Dolar"),1.64,1)+" pesos");
    }
}
