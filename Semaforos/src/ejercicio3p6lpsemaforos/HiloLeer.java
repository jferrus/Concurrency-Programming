/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3p6lpsemaforos;

/**
 *
 * @author Ricard
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
