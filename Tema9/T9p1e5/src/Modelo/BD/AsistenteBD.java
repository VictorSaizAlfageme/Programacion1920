
package Modelo.BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AsistenteBD {
    
    private PreparedStatement sentenciaPre;
    private  String plantilla;
 
     private Connection con;
    
    public AsistenteBD (Connection con)
    {
        this.con = con;
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
    
    
}
