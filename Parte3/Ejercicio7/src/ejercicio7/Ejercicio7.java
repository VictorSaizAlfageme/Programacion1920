/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
/**
 *
 * @author Egibide
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        try {
         
            
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy");
         String date1 = JOptionPane.showInputDialog("Introduce una fecha con el formato dd/MM/yy");
         LocalDate fecha1 = LocalDate.parse(date1, formato);
           
         String date2 = JOptionPane.showInputDialog("introduce otra fecha con el formato dd/MM/yy");
         LocalDate fecha2 = LocalDate.parse(date2, formato);
         
         int contador = 0;
         do
         {
             if (fecha1.getDayOfWeek()==DayOfWeek.SUNDAY)
                 contador++;
                fecha1 = fecha1.plusDays(1);
         }while(fecha1.isBefore(fecha2));
         JOptionPane.showMessageDialog(null, contador);
         
           
        }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error " + e.getClass() );

            }
        
    }
    
}
