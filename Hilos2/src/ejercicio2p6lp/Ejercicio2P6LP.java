package ejercicio2p6lp;

import java.util.ArrayList;

/**
 *
 * @author Ricard y Jose
 */
public class Ejercicio2P6LP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        crearHilos();
    }
    
    public static void crearHilos() throws InterruptedException{
        int cantidadTotal = 100;
        int cantTotalHilos = 5000;
        CuentaBancaria cuenta = new CuentaBancaria(cantidadTotal);
        int cant = 100;
        HiloMeter hiloMeter;
        HiloSacar hiloSacar;
        
        for(int i = 0; i < cantTotalHilos; i ++){
                hiloMeter = new HiloMeter(cuenta, cant);
                hiloSacar = new HiloSacar(cuenta, cant);
                
                hiloMeter.start();
                hiloSacar.start();

        }
    }
}
