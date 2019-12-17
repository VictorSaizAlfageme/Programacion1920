/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2parte6;

import clases.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel Encinas
 */
public class Ejer2Parte6 {
    public static void main(String[] args) {
        boolean pregunta = false;
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        
        do {
            listaAlumnos.add(guardarAlumno());
            
            int salir = JOptionPane.showConfirmDialog(null, "Quieres finalizar?");
            
            if(salir==0) {
                pregunta = true;
            }
        } while (pregunta==false);
        
        mostrarAlumno(listaAlumnos);
    }
    
    public static Alumno guardarAlumno() {
        int codigo, telefono;
        String nombre, domicilio;
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo: "));
        nombre = JOptionPane.showInputDialog("Introduce el nombre: ");
        domicilio = JOptionPane.showInputDialog("Introduce el domicilio: ");
        telefono = Integer.parseInt(JOptionPane.showInputDialog("Introduce el telefono: "));
        Alumno alumno = new Alumno(codigo, nombre, domicilio, telefono);
        
        return alumno;
    } 
    
    public static void mostrarAlumno(List<Alumno> listaAlumnos) {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del alumno a mostrar: "));
        
        for(Alumno alumno : listaAlumnos) {
            if(alumno.getCodigo()==codigo) {
                JOptionPane.showMessageDialog(null, 
                        String.format("Codigo: \nNombre: \nDomicilio: \nTelefono: %s", 
                                alumno.getCodigo(), alumno.getNombre(), alumno.getDomicilio(), alumno.getTelefono()));
            }
        }
    }
}
