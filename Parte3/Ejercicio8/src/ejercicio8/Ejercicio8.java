/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import excepciones.*;
import static java.lang.Character.toUpperCase;
import static java.lang.Character.toUpperCase;
/**
/**
 *
 * @author Egibide
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
       boolean pregunta = false;
        
       while (pregunta == false){
       try
        {     
        String operacion = JOptionPane.showInputDialog("¿Que deseas realizar?"
                +"\n A) Calcular la edad de una persona."
                +"\n B) Sumar 2 números ." 
                +"\n C) Contar cuantas vocales hay en una cadena." 
                +"\n D) Salir del programa.");
         
        
         if (operacion.length()!= 1){
                    throw new OperacionError();
        }
         else
             if (!operacion.equals("a") && !operacion.equals("A") && !operacion.equals("b") && !operacion.equals("B") && !operacion.equals("c") && !operacion.equals("C") && !operacion.equals("d") && !operacion.equals("D"))
                  JOptionPane.showMessageDialog(null, "Escribe los valores correctos");
         
        
        
        switch (operacion) {
            case "a":  
            case "A":
                edad();
                break;
            
            case "b":
            case "B":
                suma();
                break;
            case "c":
            case "C":
                contar();
                break;
            case "D":
            case "d":      
         JOptionPane.showMessageDialog(null, "Gracias por haber utilizado este programa");
         pregunta = true;
         break;
      
    }
    
        }catch (OperacionError e){
                JOptionPane.showMessageDialog(null, "Introduce un numero del 1 al 4");
            }
       catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "NO SALGAS");
            }
       
       catch (Exception e){
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
        }
           
              
        }
    
       
}
    
    public static void edad() {
    
     try{
           
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yyyy");
            LocalDate fechaUno = LocalDate.parse(fechaString, formatter);
           
        
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
            int año = Integer.parseInt(JOptionPane.showInputDialog("Teclea el año"));
            
            // Validaciones ???
            LocalDate fechaDos = LocalDate.of(año,mes,dia);
          
            Period period = Period.between(fechaUno, fechaDos);
            JOptionPane.showMessageDialog(null, "La diferencia es de " + period.getYears() + " años" + period.getMonths() + " meses y " + period.getDays() + " días");
        }
     catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "NO SALGAS");
            }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
        }
      
    }
    
public static void suma() {
         
    boolean correcto = false;

    while (correcto == false) 

    try
    {
           String suma1 = JOptionPane.showInputDialog("Introduce un número");
           if (suma1.length()!= 1 && suma1.length()!= 2 && suma1.length()!= 3 && suma1.length()!= 4 )
               throw new MuchosCaracteresException();
           int s1 = Integer.parseInt(suma1);

           String suma2 = JOptionPane.showInputDialog("Introduce otro número");
           if (suma2.length()!= 1 && suma2.length()!= 2 && suma2.length()!= 3 && suma2.length()!= 4 )
               throw new MuchosCaracteresException();
           int s2 = Integer.parseInt(suma2);
           JOptionPane.showMessageDialog(null, "El resultado es de " + (s1 + s2));
           correcto = true;
           break;

           } catch(MuchosCaracteresException e){
           JOptionPane.showMessageDialog(null, "El número solo puede tener como maximo 4 digitos");
           } 
            catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "NO SALGAS");
            }
           catch (Exception e){
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
            }
            
    }
     
     public static void contar() {
        try{
            
        int contador = 0;
        String cadena = JOptionPane.showInputDialog("Escribe lo que quieras");
        for (int x =0; x < cadena.length(); x++){
        if ((cadena.charAt(x)=='a') || (cadena.charAt(x)=='e') || (cadena.charAt(x)=='i') || (cadena.charAt(x)=='o') || (cadena.charAt(x)=='u'))
        contador++;
        }
         JOptionPane.showMessageDialog(null, contador);

    }catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "NO SALGAS");
            }
    catch (Exception e){
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
        }
   
     }
     }

      