
package t9p1e2;

import GUI.VentanaAcontecimientos;
import GUI.VentanaPrincipal;
import Modelo.BD.*;
import Modelo.UML.Acontecimiento;
import java.time.LocalDate;
import java.time.LocalTime;

public class Controlador {

    private static AcontecimientoBD abd;
    private static GenericoBD bdCon;
    private static Acontecimiento acontecimiento;
    
    private static VentanaPrincipal vp;
    private static VentanaAcontecimientos ve;
    
    public static void main(String[] args) {      
        try
        {
            bdCon = new GenericoBD();
            bdCon.abrirBD();
            abd = new AcontecimientoBD(bdCon.getCon());
            
            vp = new VentanaPrincipal();
            vp.setVisible(true);
         }
        catch(Exception e)
        {
             System.out.println("Problemas en el main");
        }
    }
    
    public static void visualizarVentanaAlta(){
        // Dejo por debajo la principal
         ve = new VentanaAcontecimientos();
         ve.setVisible(true);
    }
    
    public static void volver(javax.swing.JFrame v){
        v.dispose();
    }
    
    public static void grabarAcontecimiento(String nombre, String lugar, LocalDate localDate, LocalTime localTimeInicio, LocalTime localTimeFin, int nro) throws Exception{
        // Crear objeto e insertarlo en la base de datos
        acontecimiento = new Acontecimiento(nombre,lugar, localDate,localTimeInicio,localTimeFin,nro);
        
        abd.alta(acontecimiento);
    }
    
   public static void terminar() throws Exception{
       bdCon.cerrarBD();
       System.exit(0);
   }
    
}
