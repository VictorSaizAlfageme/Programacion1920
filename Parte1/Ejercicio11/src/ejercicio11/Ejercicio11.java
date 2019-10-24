/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num1 = JOptionPane.showInputDialog("Introduce un número");
        int n1 = Integer.parseInt(num1);
        String num2 = JOptionPane.showInputDialog("Introduce otro número");
        int n2 = Integer.parseInt(num2);
        String num3 = JOptionPane.showInputDialog("Introduce un tercer número");
        int n3 = Integer.parseInt(num3);
        if (n1 > n2)
            if (n1 > n3)
                JOptionPane.showMessageDialog(null, "El número mayor es " + n1  );
            else
                if ( n2 > n3 )
                    JOptionPane.showMessageDialog(null, "El número mayor es " + n2  );
                else
                    JOptionPane.showMessageDialog(null, "El número mayor es " + n3  );
        else
            if (n2 > n3)
                JOptionPane.showMessageDialog(null, "El número mayor es " + n2  );
            else
                if (n3 > n2)
                    JOptionPane.showMessageDialog(null, "El número mayor es " + n3 );
                else
                    JOptionPane.showMessageDialog(null, "El número mayor es " + n2  );
        if ( n1 < n2 )
            if (n1 < n3)
                JOptionPane.showMessageDialog(null, "El número menor es " + n1  );
            else
                if(n2 < n3)
                    JOptionPane.showMessageDialog(null, "El número menor es " + n2  );
                else
                    JOptionPane.showMessageDialog(null, "El número menor es " + n3  );
        else
            if (n2 < n3)
                 JOptionPane.showMessageDialog(null, "El número menor es " + n2  );
            else 
                if (n3 < n2)
                     JOptionPane.showMessageDialog(null, "El número menor es " + n3);
                else
                     JOptionPane.showMessageDialog(null, "El número menor es " + n2 );

    }
    
}
