
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
     
    public String ConsultarDatos(String nombre) throws Exception {
        String plantilla = "SELECT * FROM PERSONAS WHERE UPPER(NOMBRE)=?;";
        PreparedStatement ps = bd.prepareStatement(plantilla);
        nombre = nombre.toUpperCase();
        ps.setString(1, nombre);
        
        ResultSet consulta = ps.executeQuery();
        
        if(consulta.next()){
            String resultado = consulta.getString("nombre")+" , "+
                    consulta.getString("edad")+" , "+consulta.getString("profesion")+
                    " , "+consulta.getString("telefono");
            return resultado;
        }
        else{
            return "No se ha encontrado a nadie con este nombre";
        }
    }
    
    public ArrayList<Persona> VerDatos(int size, String nombre, String edad, String profesion, String telefono) throws Exception{
        ArrayList<Persona> personas = new ArrayList();
        String plantilla = "SELECT * FROM PERSONAS ORDER BY NOMBRE;";
        PreparedStatement ps = bd.prepareStatement(plantilla);
        ResultSet consulta = ps.executeQuery();
        while(consulta.next()){
            Persona p = new Persona();
            p.setNombre(consulta.getString("nombre"));
            p.setEdad(consulta.getString("edad"));
            p.setProfesion(consulta.getString("profesion"));
            p.setTelefono(consulta.getString("telefono"));
            personas.add(p);
        }
        return personas;
    }

   
    
    
}
