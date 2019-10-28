/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Egibide
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
            int año = Integer.parseInt(JOptionPane.showInputDialog("Teclea el año"));
            
            LocalDate fecha = LocalDate.of(año,mes,dia);
            
            LocalDate fechatotal = fecha.plusDays(100);
            
            JOptionPane.showMessageDialog(null, "La fecha es" + fechatotal.getDayOfWeek() + " , " + fechatotal.getDayOfMonth() + " de " + fechatotal.getMonth() + " de " + fechatotal.getYear());
            
        }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error " + e.getClass() );

            }
        
    }
    
}
