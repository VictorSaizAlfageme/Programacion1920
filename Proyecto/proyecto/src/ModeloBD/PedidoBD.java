/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Clases.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author victor
 */
public class PedidoBD {
    
    private PreparedStatement sentenciaPre;
    private  String plantilla;
 
     private Connection con;
    
    public PedidoBD(Connection con)
    {
        this.con = con;
    }
    
            
    public int obetenerUlitmoCodigoPedido() throws Exception
    {
        int CodigoPedido = 1;
        
        plantilla = "select CodigoPedido from pedido order by CodigoPedido desc";
        sentenciaPre = con.prepareStatement(plantilla);
  
        ResultSet resultado = sentenciaPre.executeQuery();
       if(resultado.next() && resultado.first()){
           CodigoPedido = resultado.getInt("CodigoPedido");
           CodigoPedido++;
       }
        
        
        return CodigoPedido;
        
    }
    
    public void insertarPedido(String Cliente, int CodigoPedido) throws Exception
    {
        
        
        plantilla = "insert into pedido (CodigoPedido,CodigoCliente,Fecha,Hora) values (?,?,?,?)";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setInt(1,CodigoPedido);
        sentenciaPre.setString(2,Cliente);
        sentenciaPre.setDate(3,java.sql.Date.valueOf(LocalDate.now()));
        sentenciaPre.setTime(4,java.sql.Time.valueOf(LocalTime.now()));

        sentenciaPre.executeUpdate();
        
    }
    
   
   
    
}
