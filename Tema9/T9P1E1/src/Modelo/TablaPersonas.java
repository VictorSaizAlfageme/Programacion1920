
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
     
    public ArrayList<Persona>  seleccionarTodo() throws Exception
    {
        ArrayList<Persona> lista = new ArrayList();
       
        // Con Statement también se puede porque no hay parametros.
        
        String plantilla = "SELECT * from personas;";
        PreparedStatement ps = bd.prepareStatement(plantilla);
       
// executeQuery NO update
      ResultSet resultado = ps.executeQuery();
      // resultado es un conjunto de filas y columnas
      // .next nos mueve a la siguiente fila y devuelve true. Si estoy ya en la última fila devuelve false.
       while(resultado.next())
       {
                // Crear objeto
                Persona p = new Persona();
                // resultado.get para coger el contenido de la columna dni que es un string
                p.setNombre(resultado.getString("nombre"));
                p.setEdad(resultado.getString("edad"));
                p.setProfesion(resultado.getString("profesion"));
                p.setTelefono(resultado.getString("telefono"));
                
                lista.add(p);
       }
       return lista;
    }
    
    
}
