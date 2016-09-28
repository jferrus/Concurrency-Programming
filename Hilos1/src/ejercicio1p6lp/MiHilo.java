package ejercicio1p6lp;

/**
 *
 * @author Ricard y Jose
 */
public class MiHilo extends Thread{
    boolean continuar = true;
    int valor = 0;
    VentanaContador ventana;
    
    public MiHilo (VentanaContador ventana){
        this.ventana = ventana;
    }
    
    public void detenerHilo(){
        continuar = false;
    }
    
    public void run(){
        while(continuar){
            System.out.println("VOY A CAMBIAR EL VALOR " + valor);
            valor = (valor + 1) % 10;
            ventana.setTitle("" + valor);
        }
    }
}
