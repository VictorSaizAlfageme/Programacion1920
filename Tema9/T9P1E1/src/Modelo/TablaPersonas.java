
package Modelo;

import t9p1e1.T9P1E1;
import java.sql.*;
import java.util.ArrayList;


public class TablaPersonas {
    
    private Connection bd;

    public TablaPersonas(Connection con) {
        this.bd = con;
    }
       
     public void insertar(Persona p) throws SQLException, Exception
    {
        // Preparar y ejecutar la sentencia sql.
        
        String plantilla = "INSERT INTO tpersonas VALUES (?,?,?,?);";
        PreparedStatement ps = bd.prepareStatement(plantilla);
        ps.setString(1, p.getNombre());
        ps.setString(2,p.getEdad());
        ps.setString(3,p.getProfesion());
        ps.setString(4,p.getTelefono());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
    
    
}
