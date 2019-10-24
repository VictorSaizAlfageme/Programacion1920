/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;
import javax.swing.JOptionPane;

/**
 *
 * @author Egibide
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num = JOptionPane.showInputDialog("Introduce un número");
        int n = Integer.parseInt(num);
        
        int cont;
        int cociente = 0;
        int x = 0;
        int b = 0;
        
        
        for(cont=n; cont!=2;cont--)
        {
          cociente = cont-1;
          do
          {
            x = cont%cociente;
            cociente = cociente -1;
                     
          }while (x != 0 && cociente != 1);
          
          if (cociente ==1 && x ==0)
              b = b +1;
          
          else
          {
              if (x==0)
                  b = b + 32;
              else
                  JOptionPane.showMessageDialog(null, cont);
          }
        }
        JOptionPane.showMessageDialog(null, "2");
    }
    
}
