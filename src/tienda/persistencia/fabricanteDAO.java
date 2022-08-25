
package tienda.persistencia;

import tienda.entidades.Fabricante;

public final class fabricanteDAO extends DAO {
    
    public void ingresarproducto() throws Exception{
        
        Fabricante fabricante = new Fabricante();
        try {
            
            if (fabricante == null)
                throw new Exception ("debe indicar un producto");
            
                String sql = "Insert into fabricante (codigo, nombre, "+"VALUES('"+ fabricante.getCodigo()+","+fabricante.getNombre()+"' ); ";
            
            insmodelim(sql);
        } catch (Exception e) {
            
            throw e;
        }
    }
}

