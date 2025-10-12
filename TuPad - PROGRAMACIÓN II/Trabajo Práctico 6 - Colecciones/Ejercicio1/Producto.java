
package tp6.colecciones;


public class Producto {
    // ATRIBUTOS
    private String ID;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    //CONSTRUCTOR
    public Producto(String ID, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    // MÉTODOS
    public void mostrarInfo(){
        // método toString
    }
    
    public String getID() {
        return ID;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
        
    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
 
    @Override
    public String toString() {
        return "Producto{" + "ID: " + ID + ", nombre: " + nombre + ", precio: $" + precio + ", cantidad: " + cantidad + ", categoría:" + categoria + '}';
    }

    
    
    
    
    
    
    
    
     

    
}
