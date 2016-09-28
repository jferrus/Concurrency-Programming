package ejercicio2p6lp;

/**
 *
 * @author Ricard y Jose
 */
public class CuentaBancaria {
    int cantidad = 0;
    
    public CuentaBancaria(int cantidad){
        this.cantidad = cantidad;
    }
    
    public synchronized void meterDinero(int cant){
        cantidad = cantidad + cant;
        
        if(cantidad < 0){
            System.out.println("LA CANTIDAD ES NEGATIVA " + cantidad);
        }
        
        System.out.println("EL SALDO RESULTANTE ES: " + cantidad);
    }
    
    public synchronized void sacarDinero(int cant){
        while(cant > cantidad)
        {
            System.out.println("LA CANTIDAD ES MAYOR QUE EL SALDO ACTUAL");
            try{
                wait();
            }catch(InterruptedException e){}
        }
        
        cantidad = cantidad - cant;
        
        notifyAll();
        
        if(cantidad < 0){
            System.out.println("LA CANTIDAD ES NEGATIVA " + cantidad);
        }
        
        System.out.println("EL SALDO RESULTANTE ES: " + cantidad);
    }
    /*
    public int getCantidad(){
        return cantidad;
    }
    */
}
