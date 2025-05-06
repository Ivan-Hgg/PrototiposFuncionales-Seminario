/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.InterfazInicial;
import Vista.gestionDeTurno;
import Vista.interfazAdmin1;
import Vista.interfazAdmin2;
import Vista.interfazAdminConfig;
import Vista.interfazAdminVerTurnos;
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
    
    public static void interfazAdmin1(InterfazInicial i){
        i.dispose();
        interfazAdmin1 vista= new interfazAdmin1();
        vista.setVisible(true);
    }
    
    public static void interfazAdmin2(interfazAdmin1 i){
        i.dispose();
        interfazAdmin2 vist = new interfazAdmin2();
        vist.setVisible(true);
    }
    
    public static void interfazAdminConfig(interfazAdmin2 i){
        i.dispose();
        interfazAdminConfig vista = new interfazAdminConfig();
        vista.setVisible(true);
    }
    
    public static void interfazAdminVerTurnos(interfazAdmin2 i){
        i.dispose();
        interfazAdminVerTurnos vista = new interfazAdminVerTurnos();
        vista.setVisible(true);
    }
            
}
