
package Modelo.BD;

import Modelo.UML.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AsistenteBD {
    
    private PreparedStatement sentenciaPre;
    private  String plantilla;
 
     private Connection con;
     private PersonaBD pbd;
    
    public AsistenteBD (Connection con)
    {
        this.con = con;
    }
    
    public void setPersonaBD(PersonaBD pbd)
    {
        this.pbd = pbd;
    }
    
    public  void alta(String dni, String nombre) throws Exception
    {
            plantilla = "INSERT INTO asistencias (dni,evento) VALUES (?,?)";
            sentenciaPre = con.prepareStatement(plantilla);
           sentenciaPre.setString(1,dni);
            sentenciaPre.setString(2,nombre);
     
            sentenciaPre.executeUpdate();
    }
    
    public int getNumeroAsistentes(String nombre) throws Exception
    {
    
         plantilla = "select count(*) from asistencias where evento = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setString(1,nombre);
        ResultSet resultado = sentenciaPre.executeQuery();
        // Sin if y sin while. Doy por hecho que tengo una fila resultado de la consulta, aunque sea con un cero
        resultado.next(); 
        int numero = resultado.getInt(1);
        return numero;
    }
    
   public ArrayList<Persona> getAsistentes(String evento) throws Exception
   {
           ArrayList<Persona> lista = new ArrayList();
           
         plantilla = "select dni from asistencias where evento = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setString(1,evento);
        ResultSet resultado = sentenciaPre.executeQuery();
        while(resultado.next())
        {
            String dni = resultado.getString("dni");
            lista.add(pbd.consultaPorDni(dni));
        }
           
           return lista;
   }
    
}
