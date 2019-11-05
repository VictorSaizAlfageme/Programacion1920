/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import javax.swing.JOptionPane;
import java.util.Arrays;
import excepciones.*;

/**
 *
 * @author Egibide
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pregunta="";
        
       
        
        
       
        do{
          
        try
        {
        String meses = JOptionPane.showInputDialog("Introduce un mes en letra");
        if (meses.isEmpty())
            throw new error();
       
         String [] mes = new String[12];
         
         mes[0] = "enero";
         mes[1] = "febrero";
         mes[2] = "marzo";
         mes[3] = "abril";
         mes[4] = "mayo";
         mes[5] = "junio";
         mes[6] = "julio";
         mes[7] = "agosto";
         mes[8] = "septiembre";
         mes[9] = "octubre";
         mes[10] = "noviembre";
         mes[11] = "diciembre";
        
        
         for (String i : mes)
        
         if(meses.equalsIgnoreCase(i)){
             JOptionPane.showMessageDialog(null, "Lo has escrito correctamente");
         }
         else 
            throw new incorrecto();
         
      
      
         
        pregunta = JOptionPane.showInputDialog("¿Deseas continuar?");
        
        }catch (error e){
        JOptionPane.showMessageDialog(null, "Error, inserte otro número");
        }
        catch (incorrecto e){
        JOptionPane.showMessageDialog(null, "Te has equivocado");
       
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR" + e.getClass());
        }
        }while (pregunta.equals("si"));
        
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa");
        
        
        }
    }
    

