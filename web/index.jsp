<%-- 
    Document   : index
    Created on : 26-10-2018, 19:53:02
    Author     : RLCR
--%>

<%@page import="entidades.Categoria"%>
<%@page import="model.E_Categoria"%>
<%@page import="model.E_editorial"%>
<%@page import="entidades.Editorial"%>
<%@page import="model.E_autor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Conexion " %> 
<%@page import="entidades.autor " %> 
        
       
<% 
       E_autor e=new E_autor();
       E_editorial ed=new E_editorial();
       E_Categoria eds=new E_Categoria();
       for (autor elem : e.verTipoCliente()) {
               out.println(elem.getNombre());
                out.println(elem.getNacionalidad());
                
           }
       for (Editorial elem : ed.verTipoEditorial()) {
               out.println(elem.getNombre());
                out.println(elem.getId_editorial());
           }
      
for (Categoria elem : eds.verTipoCategoria()) {
        out.println(elem.getCategoria());
                out.println(elem.getId_categoria());
    }
       

%> 

