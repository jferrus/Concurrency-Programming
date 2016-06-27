/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3p6lpmonitores;

/**
 *
 * @author Ricard
 */
public class BufferMonitores {
    int buffer [];
    int cantidad;
    int posLectura = 0;
    int posEscritura = 0;
    int posLibres = 10;
    int posOcupadas = 0;
    
    public BufferMonitores (int cantidad){
        this.cantidad = cantidad;
        buffer = new int[cantidad];
    }
    
    public synchronized void escribir(int a){
        while(posLibres == 0){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        
        buffer[posEscritura] = a;
        posEscritura = (posEscritura + 1) % cantidad;
        
        posOcupadas ++;
        posLibres --;
        
        System.out.println("VOY A ESCRIBIR " + a);
        
        for(int i = 0; i < buffer.length; i ++){
            System.out.print(" " + buffer[i]);
        }
        
        System.out.println("\n");
        
        notify();
    }
    
    public synchronized int leer(){
        int resultado;
        
        while(posOcupadas == 0){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        
        resultado = buffer[posLectura];
        posLectura = (posLectura + 1) % cantidad;
        
        posLibres ++;
        posOcupadas --;
        
        System.out.println("VOY A LEER " + resultado);
        
        for(int i = 0; i < buffer.length; i ++){
            System.out.print(" " + buffer[i]);
        }
        
        System.out.println("\n");
        
        notify();
        
        return resultado;
    }
}
