/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;
import javax.swing.JOptionPane;


/**
 *
 * @author 1GDAW05
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        String num1 = JOptionPane.showInputDialog("Introduce una nota del 0 al 10:");
        double n1 = Integer.parseInt(num1);
        if  (n1 >= 5 )
            if(n1 < 6)
            JOptionPane.showMessageDialog(null, "Suficiente");
            else
              if (n1 < 8)
                   JOptionPane.showMessageDialog(null, "Bien");
              else
                  if (n1 < 9)
                         JOptionPane.showMessageDialog(null, "Notable");
                  else
                      if (n1 <= 10)
                               JOptionPane.showMessageDialog(null, "Sobresaliente");
                      else
                                      JOptionPane.showMessageDialog(null, "Ese numero no esta nada bien");




        else
            if (n1 >= 3)
                            JOptionPane.showMessageDialog(null, "Insuficiente");
            else
                if (n1 >= 0)
                                JOptionPane.showMessageDialog(null, "Muy deficiente");
                else 
                                JOptionPane.showMessageDialog(null, "Ese número no mola");                        

        
    }
    
}
