
package Modelo.BD;


import Excepciones.AcontecimientoNoEncontrado;
import Modelo.UML.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;

public class AcontecimientoBD{
    
    /* Clase que contiene los métodos necesarios para trabajar
       con la tabla acontecimientos */
       
    private Acontecimiento acontecimiento;
    
    private PreparedStatement sentenciaPre;
    private  String plantilla;
 
     private Connection con;
     private AsistenteBD asisbd;
     
     // Si hay muchas relaciones, puede ser conveniente un controlador de bd.
    
    public AcontecimientoBD (Connection con,AsistenteBD asisbd)
    {
        this.con = con;
        this.asisbd = asisbd;
    }
    
    public  void alta(Acontecimiento ac) throws Exception
    {
        /* Método que inserta una fila en la tabla de los acontecimientos
            a partir de un objeto de tipo acontecimiento.
           Este método también se suele llamar save. */
            
            plantilla = "INSERT INTO acontecimientos (nombre, lugar, fecha,horaInicio, horaFin, aforo) VALUES (?,?,?,?,?,?)";
            sentenciaPre = con.prepareStatement(plantilla);
            sentenciaPre.setString(1,ac.getNombre());
            sentenciaPre.setString(2,ac.getLugar());
            sentenciaPre.setDate(3, conversionDate(ac.getFecha()));
            sentenciaPre.setTime(4, conversionTime(ac.getHoraI()));
            sentenciaPre.setTime(5, conversionTime(ac.getHoraF()));
            sentenciaPre.setInt(6,ac.getAforo());
            
            sentenciaPre.executeUpdate();
    }
    
    public java.sql.Date conversionDate(LocalDate fecha)
    {
        // Conversion LocalDate en java.sql.Date
        return java.sql.Date.valueOf(fecha);
        
    }
    
    public  java.sql.Time conversionTime(LocalTime hora)
    {
         // Conversion java.time.LocalTime en java.sql.Time
        return java.sql.Time.valueOf(hora);
    }
    
      public Acontecimiento consultaPorNombre(String nombre) throws Exception
    {
        
        plantilla = "select *  from acontecimientos where nombre = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setString(1,nombre);
            
       ResultSet resultado = sentenciaPre.executeQuery();
        if (resultado.next())
        {
            acontecimiento = crearObjeto(resultado);
        }
        else
            throw new AcontecimientoNoEncontrado();
        
        return acontecimiento;
    }
      
    public  Acontecimiento crearObjeto(ResultSet resultado) throws Exception
    {
        /* creamos y llenamos un objeto de tipo acontecimiento a partir de una
        fila con datos de la tabla acontecimientos */
        Acontecimiento a = new Acontecimiento();
        a.setNombre(resultado.getString("nombre"));
        a.setLugar(resultado.getString("lugar"));
        a.setFecha(resultado.getDate("fecha").toLocalDate());             
        a.setHoraI(resultado.getTime("horaInicio").toLocalTime());      
        a.setHoraF(resultado.getTime("horaFin").toLocalTime());
        a.setAforo(resultado.getInt("aforo"));
        return a;
    }
    
      public  void baja(String nombre) throws Exception
    {
            plantilla = "delete from acontecimientos where nombre = ?";
            sentenciaPre = con.prepareStatement(plantilla);
            sentenciaPre.setString(1,nombre);
            
            sentenciaPre.executeUpdate();
    }
      
       public  void modificar(Acontecimiento ac) throws Exception
    {
            plantilla = "update acontecimientos set lugar = ?, fecha = ?, horaInicio = ?, horaFin = ?, aforo = ? where nombre = ?";
            sentenciaPre = con.prepareStatement(plantilla);
            sentenciaPre.setString(6,ac.getNombre());
            sentenciaPre.setString(1,ac.getLugar());
            sentenciaPre.setDate(2, conversionDate(ac.getFecha()));
            sentenciaPre.setTime(3, conversionTime(ac.getHoraI()));
            sentenciaPre.setTime(4, conversionTime(ac.getHoraF()));
            sentenciaPre.setInt(5,ac.getAforo());

            sentenciaPre.executeUpdate();
    }
       
       public ArrayList<Acontecimiento> consultarLibres() throws Exception
       {
           // mejorarlo seleccionando solo los futuros con plazas libres.
               ArrayList<Acontecimiento> lista = new ArrayList();
               
             plantilla = "select * from acontecimientos where fecha > ?";
             sentenciaPre = con.prepareStatement(plantilla);
            // Conversión a sql.Date de la fecha de hoy
            sentenciaPre.setDate(1, conversionDate(LocalDate.now()));
            ResultSet resultado = sentenciaPre.executeQuery();
            while (resultado.next())
            {
               
              // ¿ Hay plazas libres???
                if (asisbd.getNumeroAsistentes(resultado.getString("nombre"))< resultado.getInt("aforo"))
                {
                               
                    // La lista de asistentes no me interesa -- Carga bajo demanda.
                    lista.add(crearObjeto(resultado));  
                }
            }
            return lista;
       }
    
}
