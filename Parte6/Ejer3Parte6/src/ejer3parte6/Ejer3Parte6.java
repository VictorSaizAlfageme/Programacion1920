/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3parte6;
import clases.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author 1gdaw07
 */
public class Ejer3Parte6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        Persona persona1 = new Persona(
                "Juan", "15", "09", "1999", "C/ Francia 6", "01010", "Madrid");
        Persona persona2 = new Persona(
                "Juanito", "25", "07", "1992", "C/ Lugo 15", "01214", "Elche");
        Persona persona3 = new Persona(
                "Marioneta", "08", "01", "2002", "C/ Mago 6", "01060", "Bilbao");
        Persona persona4 = new Persona(
                "Pepi", "26", "12", "1900", "C/ Malo 6", "01026", "Elche");
        
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        
        
        int opcion = 1;
        
        do {
            try {        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Que datos quieres ver?"
                        + "\n1. El nombre de las persona mas mayor" 
                        + "\n2. Las personas de Elche"
                        + "\n3. El numero de personas mayores de edad"
                        + "\n4. Salir"));
        
        switch (opcion) {
            case 1:
                mostrarNombreMayor(listaPersonas);
                break;
            case 2:
                mostrarElche(listaPersonas);
                break;
            case 3:
                mostrarMayorDeEdad(listaPersonas);
                break;
            case 4:
                fin();
                break;
            
            }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Debes escribir un numero del 1 al 4");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "error" + e.getClass());
            }
        }while(opcion!=4);
    
}
    
    public static void mostrarNombreMayor(ArrayList<Persona> listaPersonas) {
        String nombreMayor = "";
        int edadDelMayor = 2019;
        
        for(Persona persona: listaPersonas) {
            if(Integer.parseInt(persona.getaNacimiento()) < edadDelMayor) {
                nombreMayor = persona.getNombre();
                edadDelMayor = Integer.parseInt(persona.getaNacimiento());
            }
        }
        
        JOptionPane.showMessageDialog(null, "Las persona mas mayor es: " + nombreMayor);
    }
    
    
    public static void mostrarElche(List<Persona> listaPersonas) {
        String PersonasDeElche = "";
        for (Persona persona : listaPersonas) {
            if (persona.getCiudad().equalsIgnoreCase("Elche")) {
                PersonasDeElche += persona.getNombre() + "\n" ;
            }
        }
        JOptionPane.showMessageDialog(null, "Las personas de Elche son: \n" + PersonasDeElche);
        
    }

    public static void mostrarMayorDeEdad(List<Persona> listaPersonas) {
        int numeroMayoresDeEdad = 0;
        for(Persona persona: listaPersonas) {
            if(Integer.parseInt(persona.getaNacimiento()) < 2001) {
                numeroMayoresDeEdad++;
            }
        }
            
         JOptionPane.showMessageDialog(null, 
                 "Numero de personas mayores de edad: " + numeroMayoresDeEdad);
    }
    
     
    public static void fin() {
        JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
    }
    
}
