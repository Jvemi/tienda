
package tienda;

import java.util.Scanner;
import tienda.Servicio.Productoservice;
import tienda.persistencia.fabricanteDAO;
import tienda.persistencia.productoDAO;

public class Tienda {

    public static void main(String[] args) throws Exception {
        
       productoDAO pd = new productoDAO();
       Productoservice ps = new Productoservice();
       fabricanteDAO fd = new fabricanteDAO();
       
       int desc = 0;
       do{
           
           ps.menu();
           Scanner scann = new Scanner(System.in);
           desc = scann.nextInt();
           
           switch(desc){
               case 1:
                   
                   ps.consultanombres();
                   break;
               case 2:
                   
                   ps.consultarprecionombre();
               case 3: 
                   
                   ps.entreprecio();
                   break;
               case 4:
                   ps.buscarportatil();
                   break;
               case 5:
                   
                   pd.ingresarproducto();
                   break;
               case 6:
                   
                   fd.ingresarproducto();
                   break;
               case 7:
                   
                   pd.modificarproducto();
                   break;
               case 8:
                   
                   System.out.println("nos vemos");
                   break;
           }
               
       }while(desc != 8);
       
//       ps.consultanombres();
//       
//       ps.consultarprecionombre();

//        ps.entreprecio(); no funciona

//        ps.productobarato();
    }
 
}
