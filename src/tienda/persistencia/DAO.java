
package tienda.persistencia;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DAO {
    
    protected Connection conexion;
    protected ResultSet resultado;
    protected Statement sentencia;
        
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";
        
    public void conectarbd() throws Exception{
            
        try {
                
        Class.forName(DRIVER);
        String URLbd = "jdbc:mysql://localhost:3306/"+DATABASE+"?=convertToNull";
        conexion = DriverManager.getConnection(URLbd, USER, PASSWORD);
        } catch (Exception e) {
                
            throw e;
        }  
    }
        
    public void desconectarbd() throws SQLException{
            
    try {
                
        if(conexion != null){
                
         conexion.close();
        }
        if (resultado != null){
                
            resultado.close();
        }
        if (sentencia != null){
                
        sentencia.close();
        }
    } catch (Exception e) {
                
        throw e;
        }
    }
        
    public void insmodelim(String sql) throws Exception{
            
        try {
                
            conectarbd();
            sentencia = (Statement) conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            } catch (Exception e) {
               throw e;
            }
            finally{
                desconectarbd();
            }
        }
        
    public void consultarbd(String sql) throws Exception{
        
        try {
                
            conectarbd();
            sentencia = (Statement) conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
            
            throw e;
        }
    }
}
