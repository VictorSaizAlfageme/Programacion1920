/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Clases.Plato;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author victor
 */
public class PlatoPedidoBD {
    
    private PreparedStatement sentenciaPre;
    private  String plantilla;
 
     private Connection con;
    
     public PlatoPedidoBD(Connection con)
    {
        this.con = con;
    }
    
    public void insertarPlatos(int CodigoPedido, Integer CodigoPlato, Plato Unidades) throws Exception {
        plantilla = "insert into platopedido (CodigoPedido,CodigoPlato, Unidades) values (?,?,?)";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setInt(1,CodigoPedido);
        sentenciaPre.setInt(2,CodigoPlato);
        sentenciaPre.setInt(3,Unidades.getUnidades());

        sentenciaPre.executeUpdate();
    }

    
}
