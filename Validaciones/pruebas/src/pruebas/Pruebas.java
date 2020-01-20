/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean fechacorrecto = false;
        do {
            try{
               
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yyyy");
        LocalDate fechaUno = LocalDate.parse(fechaString, formatter);
        
            
            }catch(DateTimeParseException e){
                 JOptionPane.showMessageDialog(null, "La fecha introducida no tiene el formato que debe de tener");
               
            
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null, e.getClass());
               
            }
        
        
        }while(fechacorrecto == false);
        JOptionPane.showMessageDialog(null, "Añadido correctamente");
        alumno.setFecha(fechaUno);
}
}

do {
        String fecha = JOptionPane.showInputDialog(null, "Escribe el la fecha de nacimiento del alumno(dd/MM/YYYY)");
        Pattern pat = Pattern.compile("^((0[0-9]|[1-2][0-9]|3[0-1])/(0[13578]|1[02])/[1-2][0-9]{3})|"
        + "((0[0-9]|[1-2][0-9]|30)/(0[1469]|11)/[1-2][0-9]{3})|((0[0-9]|[1-2][0-8]|19)/02/[1-2][0-9]{3})$");
        Matcher mat = pat.matcher(fecha);
        if (mat.matches ()) {
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            fechacorrecto = true;
            alumno.setFecha(fecha);
            } else {
                JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar la fecha de nacimiento del alumno");
                   }
        }while(fechacorrecto == false);
