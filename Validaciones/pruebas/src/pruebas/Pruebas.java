/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean cursocorrecto = false;
          do {
        String curso = JOptionPane.showInputDialog(null, "Escribe el curso del alumno"
                + "\n(El primer digito representa el centro (1 - Arriaga).\n" +
"- El segundo digito representa el nivel (1- ESO 2-Bachiller 3-CFGM 4-CFGS).\n" +
"- El tercer digito representa el curso (En la ESO hay cuatro, en el resto de los niveles dos).\n" +
"- Letra que identifica el ciclo o el curso.\n" +
"- Letra que indica el modelo (A, B o D).)");
        Pattern pat = Pattern.compile("^(1[234][12][A-Z][ABD])|(11[1234][A-Z][ABD])$");
        Matcher mat = pat.matcher(curso);
        if (mat.matches ()) {
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            cursocorrecto = true;
            } else {
                JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar el curso web del alumno");
                   }
        }while(cursocorrecto == false);
    }
    
}
