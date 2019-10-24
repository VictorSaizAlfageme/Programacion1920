/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String visual = JOptionPane.showInputDialog("¿Es apto para Visual.Net?");
        String cobol = JOptionPane.showInputDialog("¿Es apto para Cobol?");
        String java = JOptionPane.showInputDialog("¿Es apto para Java?");
        String sql = JOptionPane.showInputDialog("¿Es apto para SQL?");
        
        if (visual.equals("si") && cobol.equals("si") && java.equals("si") && sql.equals("si") )
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        else
            if (visual.equals("si") || java.equals("si") && cobol.equals("si") && sql.equals("si"))
            JOptionPane.showMessageDialog(null, "Notable");
            else
                if (cobol.equals("si") && sql.equals("si"))
                    JOptionPane.showMessageDialog(null, "Bien");
                else
                    if (visual.equals("si") || java.equals("si") && sql.equals("si"))
                        JOptionPane.showMessageDialog(null, "Suficiente");
                    else
                        if (visual.equals("si") || java.equals("si") && cobol.equals("si"))
                            JOptionPane.showMessageDialog(null, "Suficiente");
                        else
                            if (visual.equals("si") && java.equals("si"))
                                JOptionPane.showMessageDialog(null, "Insuficiente");
                            else
                                JOptionPane.showMessageDialog(null, "Insuficiente");

   
    }
    
}
