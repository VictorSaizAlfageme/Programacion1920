/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarejer1;

import java.util.regex.*;

/**
 *
 * @author 1gdaw07
 */
public class ValidarEjer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "4339";
        
        Pattern pat = Pattern.compile("^[0-9]{0,}$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches ()) {
            System.out.println("SI");
            } else {
                System.out.println("NO");
                   }

        
        
    }
    
}
