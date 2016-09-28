package ejercicio2p6lp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricard y Jose
 */
public class HiloSacar extends Thread{
    int cantidad = 0;
    CuentaBancaria cuenta;
    
    public HiloSacar(CuentaBancaria cuenta, int cantidad){
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }
    
    public void run(){
        try {
            sleep((long) (Math.random() * 10));
        } catch (InterruptedException e) {};
        
        System.out.println("VOY A SACAR DINERO " + cantidad);
        cuenta.sacarDinero(cantidad);
    }
}
