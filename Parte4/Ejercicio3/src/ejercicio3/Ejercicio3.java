/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import javax.swing.JOptionPane;
import java.util.Arrays;
import excepciones.*;


/**
 *
 * @author Egibide
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        boolean terminar=false;
       
        int cadena;
        String resultado="";
        
      while(terminar==false){
        try
        {
        
        do
            {
            cadena = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion de elementos que deseas. Si escribes -1 terminará la repetitiva."));
            
            char[] letras = new char[26];
            for(int x=0; x < letras.length; x++){
            letras[x]= (char) ('A' + x );
            } 
            if (cadena == -1){
                terminar = true;
            }
            else
                if (cadena <=-2 || cadena >=27)
                    throw new error();
                else {   
                resultado = resultado + letras[cadena];
            }
            
        }while(terminar!=true);
        
        JOptionPane.showMessageDialog(null, "FIN");
        JOptionPane.showMessageDialog(null, resultado);
     
        }catch (error e){
        JOptionPane.showMessageDialog(null, "Error, inserte otro número");
        
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR" + e.getClass());
        }
    }
    }
    
}
