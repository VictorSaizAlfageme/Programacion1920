/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;
import javax.swing.JOptionPane;

/**
 *
 * @author Egibide
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        String num = JOptionPane.showInputDialog("Introduce un número");
        int n = Integer.parseInt(num);
        
        int cociente = n -1;
        int x =0;
        
        
        if (n<=2)
            JOptionPane.showMessageDialog(null, "Escribe un número mayor que 2");
        else
        {
        do
        {
         x = n%cociente;
         cociente = cociente -1;
         
         
        }while (x != 0 && cociente != 1);
        
        if (cociente ==1 && x ==0)
            JOptionPane.showMessageDialog(null, "No es primo");
        
        else
        {
            if (x==0)
                JOptionPane.showMessageDialog(null, "No es primo");
            else
                JOptionPane.showMessageDialog(null, "Es primo");
        }
        }
    }
    
}
