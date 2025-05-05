/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.InterfazInicial;
import Vista.gestionDeTurno;
import Vista.registroDatosAlumno;

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
            
}
