/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entidades.Editorial;
import entidades.autor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RLCR
 */
//metodo para reucperar todas las Editoriales//
public class E_editorial {
     public List<Editorial> verTipoEditorial() throws ClassNotFoundException, SQLException {
        List<Editorial> list = new ArrayList();
        try {
            String Query = "SELECT * FROM Editorial";

            Statement st = Conexion.obtener().createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {
                Editorial cl = new Editorial();
                cl.setId_editorial(rs.getInt("id_editorial"));
                cl.setNombre(rs.getString("nombre"));
              

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
