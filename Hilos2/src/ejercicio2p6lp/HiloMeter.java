package ejercicio2p6lp;

/**
 *
 * @author Ricard y Jose
 */
public class HiloMeter extends Thread {
    int cantidad;
    CuentaBancaria cuenta;
    
    public HiloMeter(CuentaBancaria cuenta, int cantidad) {
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }
    
    public void run(){
        try {
            sleep((long) (Math.random() * 10));
        } catch (InterruptedException e) {};
        
        System.out.println("VOY A METER DINERO " + cantidad);
        cuenta.meterDinero(cantidad);
    }
}
