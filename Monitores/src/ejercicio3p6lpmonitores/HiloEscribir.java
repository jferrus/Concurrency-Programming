package ejercicio3p6lpmonitores;

import static java.lang.Thread.sleep;

/**
 *
 * @author Ricard y Jose
 */
public class HiloEscribir extends Thread{
    int n;
    BufferMonitores buffer;
    
    public HiloEscribir (BufferMonitores buffer){
        this.buffer = buffer;
    }
    
    public void run(){
        n = (int) Math.floor(Math.random()*6+1);
        
        try {
            sleep((long) (Math.random() * 10));
        } catch (InterruptedException e) {}
        
        buffer.escribir(n);
    }
}
