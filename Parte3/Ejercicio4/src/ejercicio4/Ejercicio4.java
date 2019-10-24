/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import javax.swing.JOptionPane;
import java.time.*;
import t3p3e1.CadenaNoValida;






/**
 *
 * @author Egibide
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean correcto1;
        try {
            do{
String pedirano1 = JOptionPane.showInputDialog("Teclea un año");
if (pedirano1.length()!=4)
         throw new año();
int ano1 = Integer.parseInt(pedirano1);
String pedirmes1 = JOptionPane.showInputDialog("Teclea un mes");
int mes1 = Integer.parseInt(pedirmes1);
String pedirdia1 = JOptionPane.showInputDialog("Teclea un dia");
int dia1 = Integer.parseInt(pedirdia1);

LocalDate date1 = LocalDate.of(ano1 , mes1, dia1);  
JOptionPane.showMessageDialog(null, date1 );
correcto1 = true;
            }while (correcto1==false);

String pedirano2 = JOptionPane.showInputDialog("Teclea un año");
int ano2 = Integer.parseInt(pedirano2);
String pedirmes2= JOptionPane.showInputDialog("Teclea un mes");
int mes2 = Integer.parseInt(pedirmes2);
String pedirdia2 = JOptionPane.showInputDialog("Teclea un dia");
int dia2 = Integer.parseInt(pedirdia2);
LocalDate date2 = LocalDate.of(ano2 , mes2, dia2);        

Period diferencia = Period.between(date1, date2);

JOptionPane.showMessageDialog(null, diferencia );
    
        }catch (año e)
            {
                JOptionPane.showMessageDialog(null,"Cadena no valida. Deben ser unicamente 4 digitos.");
                correcto1 = false;
            }
    
   

    }
    }
    
