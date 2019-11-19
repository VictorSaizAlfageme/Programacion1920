/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import javax.swing.JOptionPane;
import java.util.Arrays;
import excepciones.*;

/**
 *
 * @author Egibide
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena ="";
        try
        {
        double[] arraylitros = new double[12];
        String[] meses = {"Enero" , "Febrero" , "Marzo" , "Abril" , "Mayo" , "Junio" , "Julio" , "Agosto" , "Septiembre" , "Octubre" , "Noviembre" , "Diciembre"};
       
        do{
        String day = JOptionPane.showInputDialog("Introduce un día en formato número");
        if (day.isEmpty())
            throw new error();
        int dia = Integer.parseInt(day);
        if (dia<=0 || dia>31)
            throw new dia();
       
        String month = JOptionPane.showInputDialog("Introduce un mes en formato número");
        if (month.isEmpty())
            throw new error();
        int mes = Integer.parseInt(month);
        if (mes<=0 || mes>=13)
            throw new mes();
        
        String l = JOptionPane.showInputDialog("Introduce los litros en formato número");
        if (l.isEmpty())
            throw new error();
        int litros = Integer.parseInt(l);
       
        arraylitros[mes-1] = arraylitros[mes-1]+ litros;   
        
      
        }while(JOptionPane.showInputDialog("Deseas añadir mas informacion?").equalsIgnoreCase("si"));
        
        for(int x=0; x<meses.length; x++)
        {
            cadena = cadena +"En el mes de "+ meses[x]+" ha llovido "+arraylitros[x]+" litros\n\n";
        }
          
        JOptionPane.showMessageDialog(null, cadena);
        
         }
        catch (error e){
        JOptionPane.showMessageDialog(null, "No puede estar vacío");
        }
        catch (mes e){
        JOptionPane.showMessageDialog(null, "Tiene que ser un número del 1 al 12");
        }
        catch (dia e){
        JOptionPane.showMessageDialog(null, "Tiene que ser un número del 1 al 31");
        
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Tiene que ser un número");
        }
        
    }
}
        