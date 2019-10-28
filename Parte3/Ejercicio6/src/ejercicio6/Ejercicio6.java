/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;


/**
 *
 * @author Egibide
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        
           final LocalDate PRIMAVERA = LocalDate.of(2019,3,21);
           final LocalDate VERANO = LocalDate.of(2019,6,21);
           final LocalDate OTOÑO = LocalDate.of(2019,9,21);
           final LocalDate INVIERNO = LocalDate.of(2019,12,21);
           
           
        try {
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
            LocalDate fecha = LocalDate.of(2019, mes, dia);
            
            
           if (fecha.isBefore(PRIMAVERA))
               JOptionPane.showMessageDialog(null,"Invierno");
           else
               if (fecha.isBefore(VERANO))
                       JOptionPane.showMessageDialog(null,"Primavera");
                else
                   if (fecha.isBefore(OTOÑO))
                        JOptionPane.showMessageDialog(null,"Verano");
                    else
                       if (fecha.isBefore(INVIERNO))
                            JOptionPane.showMessageDialog(null,"Otoño");

           
        }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error " + e.getClass() );

            }
        
    }
    
}
