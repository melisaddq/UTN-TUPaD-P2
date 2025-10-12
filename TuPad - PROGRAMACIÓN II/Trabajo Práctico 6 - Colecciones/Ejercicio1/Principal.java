
package tp6.colecciones;

import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
        
     Inventario inv1 = new Inventario("Inventario General");
     
     inv1.agregarProducto(new Producto("ABC123", "PC HP invictus", 1558561.23, 4, CategoriaProducto.ELECTRONICA));
     inv1.agregarProducto(new Producto("ABC456", "Mouse óptico", 121.23, 5, CategoriaProducto.ELECTRONICA));
     inv1.agregarProducto(new Producto("DFG555", "Florero verde", 1561.23, 2, CategoriaProducto.HOGAR));
     inv1.agregarProducto(new Producto("HIJ789", "Pack soquetes x10", 1561.23, 10, CategoriaProducto.ROPA));
     inv1.agregarProducto(new Producto("HIJ159", "Pack medias largas x10", 15621.23, 7, CategoriaProducto.ROPA));
     inv1.agregarProducto(new Producto("PQR852", "Yerba jijiji", 125.30, 20, CategoriaProducto.ALIMENTOS));
     
    System.out.println("---LISTA DE PRODUCTOS---");
    inv1.listarProductos();
    Producto IDencontrado;
    System.out.println("");
    System.out.println("---BUSQUEDA DE PRODUCTO ID: ABC123---");
    IDencontrado = inv1.buscarProductoPorId("ABC123");
        if (IDencontrado == null){
        System.out.println("El producto no está listado.");
        } else {
        System.out.println("Se encontró el siguiente producto: " + IDencontrado);
        }
        
        
    System.out.println("");
    System.out.println("---BUSQUEDA DE PRODUCTO ID: ABC555// INEXISTENTE---");
    IDencontrado = inv1.buscarProductoPorId("ABC555");
    if (IDencontrado == null){
        System.out.println("El producto no está listado.");
        } else {
        System.out.println("Se encontró el siguiente producto: " + IDencontrado);
        }

    
    System.out.println("");
    System.out.println("---ELIMINAR PRODUCTO ID: HIJ159---");
    inv1.eliminarProducto("HIJ159");
    System.out.println("");
    System.out.println("---ELIMINAR PRODUCTO ID: ABC555// INEXISTENTE---");
    inv1.eliminarProducto("ABC555");
    System.out.println("");
    System.out.println("---LISTA DE PRODUCTOS LUEGO DE ELIMINACIÓN---");
    inv1.listarProductos();
    
    
    System.out.println("");
    System.out.println("---STOCK ACTUAL PRODUCTO DE ID PIR8888 // INEXISTENTE---");
    inv1.obtenerTotalStock("PIR8888");
    System.out.println("---STOCK ACTUAL PRODUCTO DE ID PQR852---");
    inv1.obtenerTotalStock("PQR852");
    System.out.println("---ACTUALIZAR STOCK PRODUCTO DE ID PQR852---");
    inv1.actualizarStock("PQR852", 25);

    
    System.out.println("");
    CategoriaProducto categoriaBuscada = CategoriaProducto.ELECTRONICA;
    ArrayList<Producto> listaElectronica = inv1.filtrarPorCategoria(categoriaBuscada);
    System.out.println("--- PRODUCTOS EN LA CATEGORÍA: " + categoriaBuscada + " ---");
    if (listaElectronica.isEmpty()) {
    System.out.println("No hay productos en esta categoría.");
    } else {
    for (Producto prod : listaElectronica) {
        System.out.println(prod); 
    }
    }
    
    
    System.out.println("");
    CategoriaProducto categoriaBuscada2 = CategoriaProducto.HOGAR;
    ArrayList<Producto> listaHogar = inv1.filtrarPorCategoria(categoriaBuscada2);
    System.out.println("--- PRODUCTOS EN LA CATEGORÍA: " + categoriaBuscada2 + " ---");
    if (listaHogar.isEmpty()) {
    System.out.println("No hay productos en esta categoría.");
    } else {
    for (Producto prod : listaHogar) {
        System.out.println(prod); 
    }
    }
    
    System.out.println("");
    System.out.println("---BUSCAR PRODUCTO CON MAYOR STOCK---");
    inv1.obtenerProductoConMayorStock();
 
    System.out.println("");
    System.out.println("---FILTRAR PRODUCTOS POR PRECIO MIN $1000, MAX $3000---");
    inv1.filtrarProductosPorPrecio(1000,3000);
    
    
    System.out.println("");
    System.out.println("---MOSTRAR CATEGORIAS DISPONIBLES---");
    
    CategoriaProducto [] categorias = CategoriaProducto.values();
        for (int i = 0; i < categorias.length; i++) {
            System.out.println(categorias [i]);
            
        }
    
    
    
    

    }

}
