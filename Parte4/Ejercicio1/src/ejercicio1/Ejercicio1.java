/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author Egibide
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double max=0;
        double min=156655612;
              
        
          double [] array = new double[10];
           
          for(int x=0; x < array.length; x++){
              array[x] = Double.parseDouble(JOptionPane.showInputDialog("Escribe 1 valor"));
              if (array[x]>max)
                  max = array[x];
              if (array[x]<min)
                  min = array[x];
          }
          
        
          JOptionPane.showMessageDialog(null, "El mayor es " + max + ", El menor es " + min );
          
    }
    
}

