/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarejer20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 1gdaw07
 */
public class ValidarEjer20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "978-3-16-148410-0";
        
        Pattern pat = Pattern.compile("^(978|979)[-][0-9][-][0-9]{2}[-][0-9]{6}[-][0-9]$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches ()) {
            System.out.println("SI");
            } else {
                System.out.println("NO");
                   }
    }
    
}
