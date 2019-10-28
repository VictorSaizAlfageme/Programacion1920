/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import javax.swing.JOptionPane;
import java.time.*;







/**
 *
 * @author Egibide
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        try {
        
String pedirano1 = JOptionPane.showInputDialog("Teclea un año");
if (pedirano1.length()!=4 )
         throw new ano();
int ano1 = Integer.parseInt(pedirano1);
String pedirmes1 = JOptionPane.showInputDialog("Teclea un mes");
if (pedirmes1.length()!=2 && pedirmes1.length()!=1)
         throw new mes();
int mes1 = Integer.parseInt(pedirmes1);
String pedirdia1 = JOptionPane.showInputDialog("Teclea un dia");
if (pedirdia1.length()!=2 && pedirdia1.length()!=1 )
         throw new dia();
int dia1 = Integer.parseInt(pedirdia1);

LocalDate date1 = LocalDate.of(ano1 , mes1, dia1);  
JOptionPane.showMessageDialog(null, date1 );

            

String pedirano2 = JOptionPane.showInputDialog("Teclea un año");
if (pedirano2.length()!=4 )
         throw new ano();
int ano2 = Integer.parseInt(pedirano2);
String pedirmes2 = JOptionPane.showInputDialog("Teclea un mes");
if (pedirmes2.length()!=2 && pedirmes2.length()!=1 )
         throw new mes();
int mes2 = Integer.parseInt(pedirmes2);
String pedirdia2 = JOptionPane.showInputDialog("Teclea un dia");
if (pedirdia2.length()!=2 && pedirdia2.length()!=1 )
         throw new dia();
int dia2 = Integer.parseInt(pedirdia2);      
LocalDate date2 = LocalDate.of(ano2 , mes2, dia2);  

Period diferencia = Period.between(date1, date2);

JOptionPane.showMessageDialog(null, "La diferencia es de " + diferencia.getYears() + "años" + diferencia.getMonths() + " meses" + diferencia.getDays() + "dias"  );
       
        }catch (ano e)
            {
                JOptionPane.showMessageDialog(null,"Cadena no valida. Deben ser unicamente 4 digitos.");
               
            }
            catch (mes e)
            {
                JOptionPane.showMessageDialog(null,"Cadena no valida. Deben ser unicamente 2 digitos.");
            
            }
            catch (dia e)
            {
                JOptionPane.showMessageDialog(null,"Cadena no valida. Deben ser unicamente 2 digitos.");
            
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error " + e.getClass() );

            }
    
  

    }
    }
    
