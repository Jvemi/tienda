
package tienda.Servicio;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;
import tienda.persistencia.productoDAO;

public class Productoservice {
    
    private productoDAO dao;

    
    public Productoservice() {
        
    }
    
    productoDAO pd = new productoDAO();
    
    public void Productoservice() {
        this.dao = new productoDAO();
    }

    
    public void consultanombres() throws Exception{
        
//        productoDAO pd = new productoDAO();
        Collection <String> productos= new ArrayList();
        
        productos = pd.Nombresproductos();
        
        for (String aux : productos) {
            
            System.out.println(aux);
        }
    }
    
    public void consultarprecionombre() throws Exception{
        
        Collection <String> productos = new ArrayList();
        
        productos = pd.NyPproductos();
        
        for (String aux : productos) {
            
            System.out.println(aux);
        }
    }
    
    public void entreprecio() throws Exception{
        
        Collection <String> productos = new ArrayList();
        
        productos = pd.entreproductos();
        
        for (String aux : productos) {
            
            System.out.println(aux);
        }
    }
    
    public void buscarportatil() throws Exception{
        
        Collection <String> productos = new ArrayList();
        
        productos = pd.buscarportatil();
        
        for (String aux : productos) {
            
            System.out.println(aux);
        }
        
        
    }
    public void productobarato() throws Exception{
        
        Collection <String> productos = new ArrayList();
        
        productos = pd.productobarato();
        
        for (String aux : productos) {
            
            System.out.println(aux);
        }
    }
    
    public void menu(){
        
        System.out.println("1.nombres tabla producto \n"
                + "2.nombres y precios tabla producto \n"
                + "3.Productos entre 120 y 202 \n"
                + "4.portatiles \n"
                + "5.ingresar producto \n"
                + "6.ingresar fabricante \n"
                + "7.editar producto");
    }
}
