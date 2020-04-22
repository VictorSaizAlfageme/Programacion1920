/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author victor
 */
public class EventoDAO {
    
     private Connection bd;
    
    public PersonaDAO(Connection con)
    {
        this.bd = bd;
    }
 
   
    public void registrarPersona(Evento e) throws Exception
    {
        String plantilla = "INSERT INTO evneto VALUES (?,?,?,?,?,?);";
        PreparedStatement ps = bd.prepareStatement(plantilla);
        
        ps.setString(1, e.getNombre());
        ps.setString(2, e.getLugar());
        ps.setDate (3, e.getFecha());
        ps.setTime(4, e.getHoraInicio());
        ps.setTime (5,e.getHoraFin());
        ps.setInt (6, e.getAforo());
        
        int n = ps.executeUpdate();
  
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
    
}
