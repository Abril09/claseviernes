/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entidades.Categoria;
import entidades.Editorial;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RLCR
 */
public class E_Categoria {
  public List<Categoria> verTipoCategoria() throws ClassNotFoundException, SQLException {
        List<Categoria> list = new ArrayList();
        try {
            String Query = "SELECT * FROM Categoria";

            Statement st = Conexion.obtener().createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {
                Categoria cl = new Categoria();
                cl.setId_categoria(rs.getInt("id_Categoria"));
                cl.setCategoria(rs.getString("nombre"));
              

                list.add(cl);
            }
        } catch (Exception e) {
            //colcoar exepcion//

        } finally {
            Conexion.cerrar();

        }

           
    return list;
    }
   
    
}
