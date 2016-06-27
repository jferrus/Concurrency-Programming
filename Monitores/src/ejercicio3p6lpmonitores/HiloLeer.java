/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3p6lpmonitores;

import static java.lang.Thread.sleep;

/**
 *
 * @author Ricard
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
