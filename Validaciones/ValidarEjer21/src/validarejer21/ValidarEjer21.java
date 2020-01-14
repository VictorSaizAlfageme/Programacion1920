/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarejer21;

import java.util.ArrayList;
import java.util.regex.*;
import javax.swing.JOptionPane;
import Clases.*;


/**
 *
 * @author 1gdaw07
 */
public class ValidarEjer21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean codigocorrecto = false;
        boolean nombrecorrecto = false;
        boolean domiciliocorrecto = false;
        boolean telefonocorrecto = false;
        boolean edadcorrecto = false;
        boolean sexocorrecto = false;
        boolean fechacorrecto = false;
        boolean correopersonalcorrecto = false;
        boolean correocorrecto = false;
        boolean webcorrecto = false;
        boolean cursocorrecto = false;
        boolean estadocorrecto = false;
        String pregunta = "";
        
        
        ArrayList<Alumno> alumnos = new ArrayList();
        
        do{
        
        Alumno alumno = new Alumno();
        
              
        
        do {
        String codigo = JOptionPane.showInputDialog(null, "Escribe el codigo de alumno");
        Pattern pat = Pattern.compile("^[0-9]{5}$");
        Matcher mat = pat.matcher(codigo);
        if (mat.matches ()) {
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            codigocorrecto = true;
            alumno.setCodigo(codigo);   
            } else {
                JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar el codigo");
                   }
        }while(codigocorrecto == false);
         
        
        do {
        String nombre = JOptionPane.showInputDialog(null, "Escribe el nombre de alumno(Nombre Ape1 Ape2)");
        Pattern pat = Pattern.compile("^[A-Z][a-z]+[ ][A-Z][a-z]+[ ][A-Z][a-z]+$");
        Matcher mat = pat.matcher(nombre);
        if (mat.matches ()) {
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            nombrecorrecto = true;
            alumno.setNombre(nombre); 
            } else {
               JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar el nombre");
                   }
        }while(nombrecorrecto == false);
        
        do {
        String domicilio = JOptionPane.showInputDialog(null, "Escribe la dirección del alumno(Calle - portal - piso)");
        Pattern pat = Pattern.compile("^[A-Z][a-z]+[ ][0-9]+[ ][0-9A-Z]+$");
        Matcher mat = pat.matcher(domicilio);
        if (mat.matches ()) {
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            domiciliocorrecto = true;
            alumno.setDomicilio(domicilio);
            } else {
                JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar el domicilio");
                   }
        }while(domiciliocorrecto == false);
        
        do {
        String telefono = JOptionPane.showInputDialog(null, "Escribe el telefono de alumno(9 cifras)");
        Pattern pat = Pattern.compile("^[0-9]{9}$");
        Matcher mat = pat.matcher(telefono);
        if (mat.matches ()) {
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            telefonocorrecto = true;
            alumno.setTelefono(telefono);
            } else {
                JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar el telefono");
                   }
        }while(telefonocorrecto == false);
        
         do {
        String edad = JOptionPane.showInputDialog(null, "Escribe el telefono de alumno(2 cifras)");
        Pattern pat = Pattern.compile("^[0-9]{2}$");
        Matcher mat = pat.matcher(edad);
        if (mat.matches ()) {
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            edadcorrecto = true;
            alumno.setEdad(edad);
            
            } else {
                JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar la edad del alumno");
                   }
        }while(edadcorrecto == false);
         
        do {
        String sexo = JOptionPane.showInputDialog(null, "Escribe el telefono de alumno(H, M u O)");
        Pattern pat = Pattern.compile("^[HMO]$");
        Matcher mat = pat.matcher(sexo);
        if (mat.matches ()) {
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            sexocorrecto = true;
            alumno.setSexo(sexo);
            } else {
                JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar la edad del alumno");
                   }
        }while(sexocorrecto == false);
        
        do {
        String fecha = JOptionPane.showInputDialog(null, "Escribe el telefono de alumno(dd/MM/YYYY)");
        Pattern pat = Pattern.compile("^((0[0-9])|([1-2][0-9])|(3[0-1]))/((0[0-9])|(1[0-2]))/((1[0-9]{3})|(20[0-1][0-9])|(2020))$");
        Matcher mat = pat.matcher(fecha);
        if (mat.matches ()) {
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            fechacorrecto = true;
            alumno.setFecha(fecha);
            } else {
                JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar la edad del alumno");
                   }
        }while(fechacorrecto == false);
         
        
           do {
        String correopersonal = JOptionPane.showInputDialog(null, "Escribe el correo personal de alumno(que contenga un @)");
        Pattern pat = Pattern.compile("^[A-Za-z0-9._]+@[a-z]+\\..[a-z]+$");
        Matcher mat = pat.matcher(correopersonal);
        if (mat.matches ()) {
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            correopersonalcorrecto = true;
            alumno.setCorreopersonal(correopersonal);
            } else {
                JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar el correo personal del alumno");
                   }
        }while(correopersonalcorrecto == false);
           
        
           do {
        String correo = JOptionPane.showInputDialog(null, "Escribe el correo de alumno(que contenga un @ikasle.egibide.org)");
        Pattern pat = Pattern.compile("^[A-Za-z0-9._]+@ikasle.egibide.org");
        Matcher mat = pat.matcher(correo);
        if (mat.matches ()) {
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            correocorrecto = true;
            alumno.setCorreo(correo);
            } else {
                JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar el correo del alumno");
                   }
        }while(correocorrecto == false);
           
        do {
        String web = JOptionPane.showInputDialog(null, "Escribe la pagina web de alumno(empieza por www.)");
        Pattern pat = Pattern.compile("^www.");
        Matcher mat = pat.matcher(web);
        if (mat.matches ()) {
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            webcorrecto = true;
            alumno.setWeb(web);
            } else {
                JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar la pagina web del alumno");
                   }
        }while(webcorrecto == false);
        
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
            alumno.setCurso(curso);
            } else {
                JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar el curso web del alumno");
                   }
        }while(cursocorrecto == false);
        
        
        do {
        String estado = JOptionPane.showInputDialog(null, "Escribe la pagina web de alumno(casado o soltero)");
        Pattern pat = Pattern.compile("^(casado)|(soltero)$");
        Matcher mat = pat.matcher(estado);
        if (mat.matches ()) {
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            estadocorrecto = true;
            alumno.setEstado(estado);
            } else {
                JOptionPane.showMessageDialog(null, "No es correcto, vuelve a insetar la pagina web del alumno");
                   }
        }while(estadocorrecto == false);
    
        pregunta = JOptionPane.showInputDialog(null, "¿Deseas añadir mas alumnos?");
        
        alumnos.add(alumno);   
        
        }while(pregunta.equals(""));
        
        
        String buscaralumno = JOptionPane.showInputDialog(null, "Escribe el codigo del alumno del que quieras mostrar los datos)");
        
        for(Alumno alumno : alumnos){
            String codigobuscar = alumno.getCodigo();
            
            if(codigobuscar == buscaralumno){
                JOptionPane.showMessageDialog(null, alumnos.get(Integer.parseInt(codigobuscar)).toString() );
            }
         
        }
                
            
        }
       
            
           
           
         
    }
    
    
    
}
