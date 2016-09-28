package ejercicio3p6lpsemaforos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Ricard y Jose
 */
public class BufferSemaforos {
    int [] buffer;
    Semaphore acceso = new Semaphore(1);
    Semaphore posLibres = new Semaphore (10);
    Semaphore posOcupadas = new Semaphore (0);
    
    int posEscritura = 0;
    int posLectura = 0;
    
    public BufferSemaforos(int tamanyo){
        buffer = new int [tamanyo];
    }
    
    public void escribir(int a){
        posLibres.acquireUninterruptibly();
        acceso.acquireUninterruptibly();
        
        buffer[posEscritura] = a;
        posEscritura = (posEscritura + 1) % 10;
        
        System.out.println("VOY A ESCRIBIR " + a);
        
        for(int i = 0; i < buffer.length; i ++){
            System.out.print(" " + buffer[i]);
        }
        
        System.out.println("\n");
        
        acceso.release();
        posOcupadas.release();
    }
    
    public int leer (){
        int resultado = 0;
        
        posOcupadas.acquireUninterruptibly();
        acceso.acquireUninterruptibly();
        
        resultado = buffer[posLectura];
        posLectura = (posLectura + 1) % 10;
        
        System.out.println("VOY A LEER " + resultado);
        
        for(int i = 0; i < buffer.length; i ++){
            System.out.print(" " + buffer[i]);
        }
        
        System.out.println("\n");
        
        acceso.release();
        posLibres.release();
        
        return resultado;
    }
}
