
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

public final class productoDAO extends DAO {
    
    public void ingresarproducto() throws Exception{
        
        Producto producto = new Producto();
        try {
            
            if (producto == null)
                throw new Exception ("debe indicar un producto");
            
            String sql = "Insert into producto (codigo, nombre, precio, codigo_frabricante,"+"VALUES('"+ producto.getCodigo()+","+producto.getNombre()+","+producto.getPrecio()+","+producto.getCodigofabricante()+"' ); ";
            
            insmodelim(sql);
        } catch (Exception e) {
            
            throw e;
        }
    }
    
    public void modificarproducto() throws Exception{
        
        Producto producto = new Producto();
        try {
            
            if (producto == null)
                throw new Exception ("debe indicar un producto");
            
            String sql = "Update Producto SET producto (codigo, nombre, precio, codigo_frabricante,"+"VALUES('"+ producto.getCodigo()+","+producto.getNombre()+","+producto.getPrecio()+","+producto.getCodigofabricante()+"' ); ";
            
            insmodelim(sql);
        } catch (Exception e) {
            
            throw e;
        }
    }
     
    public Collection<String> Nombresproductos() throws Exception{
        
        try {
            
            String sql = "SELECT nombre FROM producto";
            
            consultarbd(sql);
            
            Collection <String> nproductos= new ArrayList();
            
            while(resultado.next()){
                
                nproductos.add(resultado.getString(1));
            }
             
            desconectarbd();
            return nproductos;
            
        } catch (Exception e) {
            
            throw e;
        }     
}
    
    public Collection<String> NyPproductos() throws Exception{
        
        try {
            
            String sql = "SELECT nombre,precio FROM producto";
            consultarbd(sql);
            
            Producto producto = null;
            Collection <String> productos = new ArrayList();
            
            while(resultado.next()){
                
                producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                
                String pasaje = "nombre: "+producto.getNombre()+" precio: "+producto.getPrecio().toString();
                productos.add(pasaje);
            }
             
            desconectarbd();
            return productos;
            
        } catch (Exception e) {
            
            throw e;
        }     
}
    public Collection<String> entreproductos() throws Exception{
        
        try {
            
            String sql = "SELECT * FROM producto"+"WHERE precio '>"+120+"and <"+200+"';";
            consultarbd(sql);
            
            Producto producto = null;
            Collection <String> productos = new ArrayList();
            
            while(resultado.next()){
                
                producto = new Producto();
                producto.setNombre(resultado.getNString("nombre"));
                String pasaje = producto.getNombre();
                productos.add(pasaje);
            }
             
            desconectarbd();
            return productos;
            
        } catch (Exception e) {
            
            throw e;
        }     
      
        
}
    public Collection<String> buscarportatil() throws Exception{
        
        try {
            
            String sql = "select * from producto"+"where nombre like '%Portátil%'";
            consultarbd(sql);
            
            Producto producto = null;
            Collection <String> productos = new ArrayList();
            
            while(resultado.next()){
                
                producto = new Producto();
                producto.setNombre(resultado.getNString("nombre"));
                String pasaje = producto.getNombre();
                productos.add(pasaje);
            }
             
            desconectarbd();
            return productos;
            
        } catch (Exception e) {
            
            throw e;
        }        
}
    
        public Collection<String> productobarato() throws Exception{
        
        try {
            
            String sql = "select nombre,precio from producto order by precio asc limit 1";
            consultarbd(sql);
            
            Producto producto = null;
            Collection <String> productos = new ArrayList();
            
            while(resultado.next()){
                
                producto = new Producto();
                producto.setNombre(resultado.getNString("nombre"));
                String pasaje = producto.getNombre()+" "+producto.getPrecio();
                productos.add(pasaje);
            }
             
            desconectarbd();
            return productos;
            
        } catch (Exception e) {
            
            throw e;
        }   
}
}
