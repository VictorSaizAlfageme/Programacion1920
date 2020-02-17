/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejer2;
import Clases.Persona;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class JavaEjer2 {
    static ArrayList<String> personas = new ArrayList();
    static Persona persona = new Persona();
    static VEjer2 v = new VEjer2();
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        v.setVisible(true);
    }
    
    
public static void validarNombre(String nombre) {
        persona.setNombre(nombre);
}


public static void validarApellido(String apellido) {
            persona.setApellido(apellido);
            
}


public static void validarDni(String DNI) {
            persona.setDNI(DNI);
}

public static void GuardarPersona() {

    String Persona = persona.toString();
    personas.add(Persona);
    
}

public static void MostrarV2() {
    v.setVisible(false);
    V2Ejer2 v2 = new V2Ejer2();
    v2.setVisible(true);
}

public static String MostrarPersonas() {
        String GrupoPersonas = "";
        
        for(int x = 0; x < personas.size(); x++){
        GrupoPersonas = GrupoPersonas + personas.get(x) + "\n";
            }
        
        return GrupoPersonas;
    
}


}
