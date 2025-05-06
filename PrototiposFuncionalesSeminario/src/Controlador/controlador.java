/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.AgregarDocumentos;
import Vista.ConfirmacionTurno;
import Vista.InterfazInicial;
import Vista.gestionDeTurno;
import Vista.registroDatosAlumno;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.JFrame;


/**
 *
 * @author Ivan y otros
 */
public class controlador {
    
    
    
    public static void inicio(){
        InterfazInicial i= new InterfazInicial ();
        i.setVisible(true);
    }
    
    public static void incioRegistroDatosAlumno(InterfazInicial i){
        i.dispose();
        registroDatosAlumno v = new registroDatosAlumno();
        v.setVisible(true);
    }
    
    public static void inicioGestionDeTurno(registroDatosAlumno i){
        i.dispose();
        gestionDeTurno t = new gestionDeTurno();
        t.setVisible(true);
    }
            
      public static void agregarDocumentos(gestionDeTurno g){
        g.dispose();
        AgregarDocumentos a = new AgregarDocumentos();
        a.setVisible(true);
    }
      
      public static void SeleccionDeArchivo(JFrame ventanaActual, ActionEvent evt) {
        JFileChooser chooser = (JFileChooser) evt.getSource();

        if (evt.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
            File archivo = chooser.getSelectedFile();
            System.out.println("Archivo seleccionado: " + archivo.getAbsolutePath());

            ventanaActual.dispose();  // Cerramos la ventana actual

            // Si querés pasar el archivo, usá un constructor personalizado:
            gestionDeTurno siguientePantalla = new gestionDeTurno(); 
            siguientePantalla.setVisible(true);

        } else if (evt.getActionCommand().equals(JFileChooser.CANCEL_SELECTION)) {
            ventanaActual.dispose();  // Cerramos la ventana actual
            new gestionDeTurno().setVisible(true);
        }
    }
      
        public static void confirmacionTurno(gestionDeTurno s){
    
        }
}
