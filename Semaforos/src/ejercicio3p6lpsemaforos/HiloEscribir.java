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
