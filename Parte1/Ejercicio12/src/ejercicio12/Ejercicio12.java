/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;
import javax.swing.JOptionPane;


/**
 *
 * @author 1gdaw05
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num1 = JOptionPane.showInputDialog("Introduce el consumo");
        Double n1 = Double.parseDouble(num1);
        if (n1 < 300)
            JOptionPane.showMessageDialog(null, "El consumo es de " +  n1 * 0.04  );
        else
            if (n1 >= 300 && n1 < 500)
                JOptionPane.showMessageDialog(null, "El consumo es de " +  n1 * 0.03  );
            else
                if (n1 < 800)
                    JOptionPane.showMessageDialog(null, "El consumo es de " +  300 * 0.03 + ((n1 - 300)*0.02)  );
                else
                
                    JOptionPane.showMessageDialog(null, "El consumo es de " + ((300 * 0.03 + ((n1 - 300)*0.02)) - (((300 * 0.03 + ((n1 - 300)*0.02))*1.25)/100)) );
                 
    }
    
}
