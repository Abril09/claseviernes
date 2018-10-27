/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class E_autor {
    //metodo para reucperar todos los Autores//
     public List<autor> verTipoCliente() throws ClassNotFoundException, SQLException{
           List<autor>list=new ArrayList();
           try {
            String Query="SELECT * FROM autor";
            
            Statement st=Conexion.obtener().createStatement();
            ResultSet rs=st.executeQuery(Query);
            
            while(rs.next()){
                autor cl=new autor();
                cl.setId_autor(rs.getInt("id_autor"));
                 cl.setNombre(rs.getString("nombre"));
                cl.setNacionalidad(rs.getString("nacionalidad"));
             
               
                list.add(cl);
            }}
            catch(Exception e){
                    System.out.println("Error");
                    
                    }finally{
            Conexion.cerrar();
            
           }
           
           
    return list;
    }
   
}
