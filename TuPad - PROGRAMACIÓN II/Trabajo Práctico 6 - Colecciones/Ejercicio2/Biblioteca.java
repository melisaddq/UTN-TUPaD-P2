
package tp6.colecciones.casopráctico2;

import java.util.ArrayList;


public class Biblioteca {
    
    private String nombre;
    private ArrayList<Libro> libros;

    
    // CONSTRUCTOR
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    // METODOS
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
    Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
    this.libros.add(nuevoLibro);
    System.out.println("El libro " + titulo + " fue agregado al inventario exitosamente.");
    }

    
    public void listarLibros(){
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
            return;
        }
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    
    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro; 
            }
        }
        return null; 
    }
    
    public Libro eliminarLibro(String isbn){
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        this.libros.remove(libroAEliminar);
        if (libroAEliminar != null){
        System.out.println("El libro " + libroAEliminar.getTitulo() + " se ha eliminado satisfactoriamente.");
        } else {
        System.out.println("El libro a eliminar no se encuentra listado");
        }
        return libroAEliminar;
        }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
    ArrayList<Libro> librosFiltrados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                librosFiltrados.add(libro);
            }
        }
        return librosFiltrados;
    }

    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("No hay autores para listar.");
            return;
        }
        ArrayList<Autor> autores = new ArrayList<>();
    for (Libro libro : this.libros) {
        Autor autorActual = libro.getAutor();
        if (!autores.contains(autorActual)) {
            autores.add(autorActual);
        }
    }
        System.out.println("--- AUTORES DISPONIBLES EN LA COLECCIÓN (" + autores.size() + ") ---");
        for (Autor autor : autores) {
            System.out.println(autor);
        }
    }

    
    /*agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor) OK
• listarLibros() OK
• buscarLibroPorIsbn(String isbn) OK
• eliminarLibro(String isbn) OK
• obtenerCantidadLibros() OK
• filtrarLibrosPorAnio(int anio) OK
• mostrarAutoresDisponibles()*/


    

    
    
    
    
    
    
    
}
