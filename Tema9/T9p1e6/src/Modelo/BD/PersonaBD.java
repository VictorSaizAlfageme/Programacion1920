
package Modelo.BD;

import Modelo.UML.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PersonaBD{
    
    /* Clase que contiene los métodos necesarios para trabajar
       con la tabla personas */
       
    private Persona p;
    
    private PreparedStatement sentenciaPre;
    private  String plantilla;
 
     private Connection con;
    
    public PersonaBD (Connection con)
    {
        this.con = con;
    }
    
    public  void alta(Persona p) throws Exception
    {
            
            plantilla = "INSERT INTO personas (dni,nombre,ape1,ape2,telefono) VALUES (?,?,?,?,?)";
            sentenciaPre = con.prepareStatement(plantilla);
           sentenciaPre.setString(1,p.getDni());
            sentenciaPre.setString(2,p.getNombre());
            sentenciaPre.setString(3, p.getApe1());
            sentenciaPre.setString(4, p.getApe2());
            sentenciaPre.setString(5, p.getTelefono());
     
            sentenciaPre.executeUpdate();
    }
    
    
      public Persona consultaPorDni(String d) throws Exception
    {
        
        plantilla = "select *  from personas where dni = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setString(1,d);
            
       ResultSet resultado = sentenciaPre.executeQuery();
        if (resultado.next())
        {
            crearObjeto(resultado);
        }
        else
            p = null;
        
        return p;
    }
      
    public  void crearObjeto(ResultSet resultado) throws Exception
    {
      
       p = new Persona();
       p.setDni(resultado.getString("dni"));
       p.setNombre(resultado.getString("nombre"));
       p.setApe1(resultado.getString(3));
       p.setApe2(resultado.getString(4));
       p.setTelefono(resultado.getString("telefono"));
      
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
          
            sentenciaPre.setInt(5,ac.getAforo());

            sentenciaPre.executeUpdate();
    }
    
}
