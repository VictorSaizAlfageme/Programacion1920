package Modelo.BD;

import Modelo.ClasesUML.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonaDAO {
    
    private Connection con;
    
    public PersonaDAO(Connection con)
    {
        this.con = con;
    }
 
   
    public void registrarPersona(Persona p) throws Exception
    {
        String plantilla = "INSERT INTO personas VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setString(1, p.getNombre());
        ps.setInt(2,p.getEdad());
        ps.setString(3, p.getProfesion());
        ps.setString(4,p.getTelefono());
        
        int n = ps.executeUpdate();
  
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }


   public Persona consultarPersona(String nombre) throws Exception
   {
       Persona persona=null;
 
       PreparedStatement consulta = con.prepareStatement("SELECT * FROM personas where nombre = ? ");
       consulta.setString(1, nombre);
       ResultSet res = consulta.executeQuery();

       // Sólo puede haber una persona con ese nombre
       if(res.next())
       {
          persona=crearObjeto(res);
       }
       else
            throw new Exception ("Persona no encontrada");
 
       return persona;
    }

    public Persona crearObjeto(ResultSet res) throws Exception
    {
           Persona persona= new Persona();
           persona.setNombre(res.getString("nombre"));
           persona.setEdad(res.getInt("edad"));
           persona.setProfesion(res.getString("profesion"));
           persona.setTelefono(res.getString("telefono"));
           return persona;
    }
    
    public ArrayList<Persona> listaDePersonas() throws Exception
    {
        ArrayList< Persona> listaPersonas = new ArrayList();

        // Es más seguro con preparedStatement
        Statement consulta = con.createStatement();
        ResultSet res = consulta.executeQuery("Select * from personas");
        
        while(res.next())
        {
                 listaPersonas.add(crearObjeto(res));
        }
        return listaPersonas;
 }
}
 
