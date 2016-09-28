package ejercicio3p6lpsemaforos;

/**
 *
 * @author Ricard y Jose
 */
public class HiloEscribir extends Thread{
    BufferSemaforos buffer;
    int n;
    
    public HiloEscribir (BufferSemaforos buffer){
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
