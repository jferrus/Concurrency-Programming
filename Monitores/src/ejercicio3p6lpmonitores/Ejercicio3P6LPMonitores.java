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
public class Ejercicio3P6LPMonitores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        crearHilos();
    }
    
    public static void crearHilos(){
        int numTotalHilos = 10000;
        int cantidad = 10;
        BufferMonitores bufferMonitores = new BufferMonitores(cantidad);
        HiloLeer hiloLeer;
        HiloEscribir hiloEscribir;
        
        for(int i = 0; i < numTotalHilos; i ++){
            hiloLeer = new HiloLeer(bufferMonitores);
            hiloEscribir = new HiloEscribir(bufferMonitores);
            
            hiloLeer.start();
            hiloEscribir.start();
        }
    
    }
    
}
