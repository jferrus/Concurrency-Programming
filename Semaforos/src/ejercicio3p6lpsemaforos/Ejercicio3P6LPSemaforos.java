package ejercicio3p6lpsemaforos;

/**
 *
 * @author Ricard y Jose
 */
public class Ejercicio3P6LPSemaforos {
    
    
    public static void main(String[] args) {
        crearHilos();
    }
    
    public static void crearHilos(){
        int numTotalHilos = 10000;
        int cantidad = 10;
        BufferSemaforos bufferSemaforos = new BufferSemaforos(cantidad);
        HiloLeer hiloLeer;
        HiloEscribir hiloEscribir;
        
        for(int i = 0; i < numTotalHilos; i ++){
            hiloLeer = new HiloLeer(bufferSemaforos);
            hiloEscribir = new HiloEscribir(bufferSemaforos);
            
            hiloLeer.start();
            hiloEscribir.start();
        }
    
    }
}

