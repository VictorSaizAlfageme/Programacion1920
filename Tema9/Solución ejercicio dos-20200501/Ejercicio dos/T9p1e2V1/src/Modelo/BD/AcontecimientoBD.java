
package Modelo.BD;


import Modelo.UML.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

public class AcontecimientoBD{
    
    /* Clase que contiene los métodos necesarios para trabajar
       con la tabla acontecimientos */
       
    private  Acontecimiento acontecimiento;
    
    private  PreparedStatement sentenciaPre;
    private  String plantilla;
 
     private Connection con;
    
    public AcontecimientoBD (Connection con)
    {
        this.con = con;
    }
    
    public  void alta(Acontecimiento ac) throws Exception
    {
        /* Método que inserta una fila en la tabla de los acontecimientos
            a partir de un objeto de tipo acontecimiento.
           Este método también se suele llamar save.
        */
            
        // Preparar la sentencia que se quiere ejecutar
            plantilla = "INSERT INTO acontecimientos (nombre, lugar, fecha,horaInicio, horaFin, aforo) VALUES (?,?,?,?,?,?)";
            sentenciaPre = con.prepareStatement(plantilla);
            sentenciaPre.setString(1,ac.getNombre());
            sentenciaPre.setString(2,ac.getLugar());
            sentenciaPre.setDate(3, conversionDate(ac.getFecha()));
            sentenciaPre.setTime(4, conversionTime(ac.getHoraI()));
            sentenciaPre.setTime(5, conversionTime(ac.getHoraF()));
            sentenciaPre.setInt(6,ac.getAforo());
            
            // Ejecutar sentencia
            int n = sentenciaPre.executeUpdate();
            System.out.println( n + "filas insertadas");
    }
    
    public  java.sql.Date conversionDate(LocalDate fecha)
    {
        // Conversion LocalDate en java.sql.Date
        return java.sql.Date.valueOf(fecha);
        
    }
    
    public  java.sql.Time conversionTime(LocalTime hora)
    {
         // Conversion java.time.LocalTime en java.sql.Time
        return java.sql.Time.valueOf(hora);
    }
    
    
}
