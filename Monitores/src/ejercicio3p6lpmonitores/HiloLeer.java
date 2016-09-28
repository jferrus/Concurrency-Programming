package ejercicio3p6lpmonitores;

import static java.lang.Thread.sleep;

/**
 *
 * @author Ricard y Jose
 */
public class HiloLeer extends Thread{
    BufferMonitores buffer;
    
    public HiloLeer(BufferMonitores buffer){
        this.buffer = buffer;
    }
    
    public void run(){
        try {
            sleep((long) (Math.random() * 10));
        } catch (InterruptedException e) {}
        
        buffer.leer();
    }
}
