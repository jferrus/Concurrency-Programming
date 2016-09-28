package ejercicio1p6lp;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Ricard y Jose
 */
public class VentanaContador extends JFrame {
    JButton botonComenzar;
    JButton botonFinalizar;
    int contador;
    boolean continuar;
    MiHilo hilo;
    VentanaContador ventana;
    
    public VentanaContador()
    {
        botonComenzar = new JButton("Comenzar");
        botonFinalizar = new JButton("Finalizar");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(botonComenzar);
        getContentPane().add(botonFinalizar);
        ventana = this;

        botonComenzar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if (continuar == false)
                {
                    continuar = true;

                    hilo = new MiHilo(ventana);
                    hilo.start();
                    
                }
            }
        });

        botonFinalizar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                continuar = false;
                hilo.detenerHilo();
            }
        });

        setSize(300,80);
    }
    
    public static void main(String[] argv)
    {
        (new VentanaContador()).setVisible(true);
    }
}
