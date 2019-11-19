/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
import javax.swing.JOptionPane;
import java.util.Arrays;
 

/**
 *
 * @author Egibide
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Ejercicio8 {

    public static String resultado="";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int contador=0;
    int[] codalumno = new int[5];
    int[] faltas = new int[5];
    int x = 0;
    int mas = 0;
    
    do
    {
        int y = 0;
        int id;
        int horas;
        id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ID del alumno"));
        horas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas que ha faltado el alumno " + id));
        int fecha = Integer.parseInt(JOptionPane.showInputDialog("¿Que dia fúe?"));
       
        for (x =0; x<codalumno.length && codalumno[x]!=0; x++){
        
        if (id==codalumno[x]){
        faltas[x]= faltas[x] + horas;
        y = 1;
        }
        
        }
        if (y==0){
        codalumno[x] = id;
        faltas[x] = horas;
        contador++;
        }
        
        
      
        if (contador != 5)
        mas = JOptionPane.showConfirmDialog(null, "¿Deseas añadir más alumnos?");
              
     }while (contador!=5 && mas ==0);
    
    for (x=0; x<codalumno.length; x++){
        if(codalumno[x]!=0)
        resultado = resultado + "\nEl alumno " + codalumno[x] + " ha faltado " + faltas[x] +" horas";
    }
    
    if (contador == 5){
        JOptionPane.showMessageDialog(null, "Ya hay 5 alumnos");
    
    }
    JOptionPane.showMessageDialog(null, resultado);
    
        
    }
    
}
