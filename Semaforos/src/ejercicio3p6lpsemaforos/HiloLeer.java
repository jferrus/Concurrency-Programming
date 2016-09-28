package ejercicio3p6lpsemaforos;

/**
 *
 * @author Ricard y Jose
 */
public class HiloLeer extends Thread {
    BufferSemaforos buffer;
    
    public HiloLeer(BufferSemaforos buffer){
        this.buffer = buffer;
    }
    
    public void run(){
        try {
            sleep((long) (Math.random() * 10));
        } catch (InterruptedException e) {}
        
        buffer.leer();
    }
}
