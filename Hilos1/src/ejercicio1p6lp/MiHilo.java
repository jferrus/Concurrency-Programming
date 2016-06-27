/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1p6lp;

/**
 *
 * @author Ricard
 */
public class MiHilo extends Thread{
    boolean continuar = true;
    int valor = 0;
    VentanaContador ventana;
    
    public MiHilo (VentanaContador ventana){
        this.ventana = ventana;
    }
    
    public void detenerHilo(){
        continuar = false;
    }
    
    public void run(){
        while(continuar){
            System.out.println("VOY A CAMBIAR EL VALOR " + valor);
            valor = (valor + 1) % 10;
            ventana.setTitle("" + valor);
        }
    }
}