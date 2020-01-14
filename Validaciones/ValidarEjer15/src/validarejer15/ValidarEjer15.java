/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarejer15;

import java.util.regex.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class ValidarEjer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int decimales = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos decimales quieres?"));
        String numero = JOptionPane.showInputDialog(null, "Escribe el numero decimal con los decimales que has decidio poner");
        Pattern pat = Pattern.compile("^[0-9]+[.,][0-9]{" + decimales + "}$");
        Matcher mat = pat.matcher(numero);
        if (mat.matches ()) {
            System.out.println("SI");
            } else {
                System.out.println("NO");
                   }

    }
    
}
