package model;


import entidades.autor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class Conexion {
     private static Connection cnx=null;
     
    public static Connection obtener() throws ClassNotFoundException, SQLException{
     
    if(cnx==null){
    try{ 
        Class.forName("org.sqlite.JDBC");
        cnx=(Connection) DriverManager.getConnection("jdbc:sqlite:C:\\Users\\RLCXX\\Documents\\NetBeansProjects\\WebApplication1\\Recursos\\libros.db");
        
        }catch(SQLException ex){
        throw new SQLException(ex);
        }catch(ClassNotFoundException ex){
            throw new ClassCastException(ex.getMessage());
           
        }    
    }    
    return cnx;
    }
    
    public static void cerrar() throws SQLException{
    if(cnx!=null){
        
        cnx.close();
        cnx=null;
    
    }
    
}
    
    
}
