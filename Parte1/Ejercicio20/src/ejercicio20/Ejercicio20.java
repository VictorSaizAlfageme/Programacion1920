/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;
import javax.swing.JOptionPane;

/**
 *
 * @author Egibide
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        
        int x = (int)(Math.random()*100);
        int n;
        
        boolean condi = false;
        
        do
        {
        String num = JOptionPane.showInputDialog("Intenta acertar el número");
        n = Integer.parseInt(num);
        
        if (n == x)
            JOptionPane.showMessageDialog(null, "El número es " + x);
               
        
        else {
            JOptionPane.showMessageDialog(null, "El número esta entre el  " + (x-(int)(Math.random()*10)));
            JOptionPane.showMessageDialog(null, "El número esta entre el  " + (x+(int)(Math.random()*10)));  
            String pregunta = JOptionPane.showInputDialog("¿Quieres finalizar el juego?");
            condi= pregunta.equals("si");
        }
        
        }while (condi==false && n!=x);     
       
          JOptionPane.showMessageDialog(null, "Gracias por jugar");  
    } 
}
    

   
    

