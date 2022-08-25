
package tienda.entidades;

public class Producto {
    
    private Integer codigo;
    private String nombre;
    private Double precio;
    private int codigofabricante;

    public Producto() {
    }

    public Producto(Integer codigo, String nombre, Double precio, Integer codigofabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigofabricante = codigofabricante;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCodigofabricante() {
        return codigofabricante;
    }

    public void setCodigofabricante(Integer codigofabricante) {
        this.codigofabricante = codigofabricante;
    }
    
    
}
