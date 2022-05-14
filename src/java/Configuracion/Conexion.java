
package Configuracion;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class Conexion {
    
    private static final String CADENA="jdbc:sqlserver://localhost:1433;database=universidad";
    private static final String USER ="sebas";
    private static final String PASS="tacos3312";
    
    public static Connection getConnection(){
        
        Connection con = null;
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con =DriverManager.getConnection(CADENA, USER, PASS);
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
        return con;
    }
    
    public static void CerrarConexion (Connection con){
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void CerrarConexion (ResultSet rs){
        try {
            rs.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
   /* public static void main(String[] args) {
        System.out.println(Conexion.getConnection());
    }*/
}

