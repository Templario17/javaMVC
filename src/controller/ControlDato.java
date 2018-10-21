/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.datosVista;

/**
 * 
 * @author Daniel Andres
 */
public class ControlDato implements ActionListener{
     private datosVista VistaDatosSensor;

    public ControlDato(datosVista VistaDatosSensor) {
        this.VistaDatosSensor = VistaDatosSensor;
        
        this.VistaDatosSensor.salir_dato.addActionListener(this);
        
        //vista 
        this.VistaDatosSensor.setVisible(true);
        
    }
    
    
     
     
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.VistaDatosSensor.salir_dato)){
            JOptionPane.showMessageDialog(null, "Accion");
        }
        
    }

}
