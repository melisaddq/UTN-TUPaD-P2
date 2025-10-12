
package tp6.colecciones;

import java.util.ArrayList;


public class Inventario {
    // ATRIBUTOS
    private ArrayList<Producto> productos;
    private String nombre;
    // CONSTRUCTOR
    public Inventario(String nombre) {
        this.nombre = nombre;
        this.productos=new ArrayList<>();
    }
    // METODOS
    public void agregarProducto(Producto P){
        this.productos.add(P);
    }

    
    public void listarProductos(){
        for (Producto prod : productos) {
            System.out.println(prod);
        }
    }
    
    private int cantProductos(){
        return productos.size();
    }
    
    
    public Producto buscarProductoPorId(String ID){
        Producto IDencontrado = null;
        int i = 0;
        while (i < cantProductos() && !this.productos.get(i).getID().equalsIgnoreCase(ID)) {
            i++;
        }
        if (i < cantProductos()) {
            IDencontrado = this.productos.get(i);
        }
        return IDencontrado;
    }


    public Producto eliminarProducto(String ID){
        Producto aBorrar = buscarProductoPorId(ID);
        this.productos.remove(aBorrar);
        if (aBorrar != null){
        System.out.println("El producto se ha eliminado satisfactoriamente.");
        } else {
        System.out.println("El producto a eliminar no se encuentra listado");
        }
        return aBorrar;

    }
    
    public void obtenerTotalStock(String ID){
        Producto productoExistente = buscarProductoPorId(ID);
        if (productoExistente != null) {
        System.out.println("Stock del producto con ID " + ID + " es " + productoExistente.getCantidad() + ".");
        } else {
        System.out.println("El producto con ID " + ID + " no se encuentra listado.");
        }
    }


    public boolean actualizarStock(String ID, int nuevaCantidad) {
    Producto productoExistente = buscarProductoPorId(ID);
    if (productoExistente != null) {
        productoExistente.setCantidad(nuevaCantidad);
        System.out.println("Stock del producto con ID " + ID + " actualizado a " + nuevaCantidad + ".");
        return true;
    } else {
        System.out.println("El producto con ID " + ID + " no se encuentra listado.");
        return false;
    }
}
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
    ArrayList<Producto> productosFiltrados = new ArrayList<>();
    for (Producto producto : this.productos) {
        if (producto.getCategoria().equals(categoria)) {
            productosFiltrados.add(producto);
        }
    }
    return productosFiltrados;
    }
 
   public Producto obtenerProductoConMayorStock() {
    if (this.productos.isEmpty()) {
        System.out.println("El inventario está vacío.");
        return null;
    }
    Producto productoMayorStock = this.productos.get(0);
    for (int i = 1; i < this.productos.size(); i++) {
        Producto productoActual = this.productos.get(i);
        if (productoActual.getCantidad() > productoMayorStock.getCantidad()) {
            productoMayorStock = productoActual;
        }
    }
    System.out.println("El producto con mayor stock es: ");
    System.out.println(productoMayorStock);
    
    return productoMayorStock;
    }
    
    
   public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
   ArrayList<Producto> productosPorPrecio = new ArrayList<>();
    if (min > max) {
        System.out.println("El precio mínimo (" + min + ") no puede ser mayor que el precio máximo (" + max + ").");
        return productosPorPrecio;
    }
    for (Producto producto : this.productos) {
        double precioProducto = producto.getPrecio();
        if (precioProducto >= min && precioProducto <= max) {
            productosPorPrecio.add(producto); // SI CUMPLE CON EL RANGO SE AGREGA A LA NUEVA LISTA
        }
    }
    if (productosPorPrecio.isEmpty()) {
         System.out.println("No se encontraron productos en el rango de $" + min + " a $" + max + ".");
    } else {
         System.out.println( productosPorPrecio.size() + " productos encontrados en el rango de $" + min + " a $" + max + ": \n" + productosPorPrecio);

    }
    return productosPorPrecio;
   }
   
   
   
    
}
