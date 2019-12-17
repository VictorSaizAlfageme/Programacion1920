/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_parte6;
import clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Ejemplo_Parte6 {

    public static void main(String[] args) {
        // Creo objetos
        
        Persona p1;
        p1 = new Persona();
        p1.edad = 19;
        p1.setDNI("726889147E");
        p1.setEdad(22);
        p1.setNombre("Pepe");
        p1.setApellidos("Ramirez");
        JOptionPane.showMessageDialog(null, p1.getNombre() + " es " + p1.isMayor());
        
        
        Persona p2 = new Persona("Juan", 15, "24966448Y","ito");
        Persona p3 = new Persona("Arkano", 23, "249675248U","Gordo");
        
        
        Coche c1 = new Coche("1158 BHP", "Amarillo");
        Coche c2 = new Coche("5475 PCR", "Blanco");
        Coche c3 = new Coche("5894 GMR", "Rojo");
        
        ArrayList<Coche> lista = new ArrayList();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        
        p1.setLista(lista);
        
       
        //Relacion de cardinalidad 1 
        //p1.setCoche(c1);
        
        Coche c4 = new Coche("6598 CKL", "Rojo");
        p1.setUnCoche(c4);
        
        JOptionPane.showMessageDialog(null, p1.getNombre() + " es " + p1.isMayor() + " y su coche es de color " + p1.getLista());
        
        
        Persona[] listaPersonas = new Persona[3];
        listaPersonas[0] = p1;
        listaPersonas[1] = p2;
        listaPersonas[2] = p3;
        
        
    }
    
}
