
package tp6.colecciones.casopráctico2;

import java.util.ArrayList;


public class Principal {


    public static void main(String[] args) {
        
        Biblioteca miBiblio1 = new Biblioteca("Biblioteca Alberdi");

        // 2. Crear al menos tres autores.
        Autor autor1 = new Autor("A001", "George Orwell", "Británica");
        Autor autor2 = new Autor("A002", "Stephen King", "Estadounidense");
        Autor autor3 = new Autor("A003", "Yuval Noah Harari", "Israelí");
        

        miBiblio1.agregarLibro("978-001", "Rebelión en la granja", 1945, autor1);
        miBiblio1.agregarLibro("978-002", "1984", 1949, autor1);
        miBiblio1.agregarLibro("978-003", "Carrie", 1974, autor2);
        miBiblio1.agregarLibro("978-004", "Sapiens: De animales a dioses", 2014, autor3);
        miBiblio1.agregarLibro("978-005", "El Resplandor", 1977, autor2);

        System.out.println(" ");
        System.out.println("--- LISTA DE LIBROS EXISTENTE ---");
        System.out.println(" ");
        miBiblio1.listarLibros();

        System.out.println(" ");
        System.out.println("---BUSCAR LIBRO POR ISBN 978-003---");
        System.out.println(" ");
        Libro libroEncontrado = miBiblio1.buscarLibroPorIsbn("978-003");
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: ");
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        System.out.println(" ");
        System.out.println("--- FILTRAR LIBRO POR AÑO 1974 ---");
        System.out.println(" ");
        ArrayList<Libro> librosFiltrados = miBiblio1.filtrarLibrosPorAnio(1974);
        
        if (librosFiltrados.isEmpty()) {
            System.out.println("No se encontraron libros publicados para el año esperado.");
        } else {
            System.out.println("Libros publicados en el año buscado:");
            for (Libro libro : librosFiltrados) {
                System.out.println("- " + libro);
            }
        }

        System.out.println(" ");
        System.out.println("--- ELIMINAR LIBRO ---");
        System.out.println(" ");

        miBiblio1.eliminarLibro("978-004"); 
        
        System.out.println(" ");
        System.out.println("--- LISTA DESPUÉS DE LA ELIMINACIÓN ---");
        System.out.println(" ");
        miBiblio1.listarLibros();

        System.out.println(" ");
        System.out.println("--- OBTENER CANTIDAD DE LIBROS ---");
        System.out.println(" ");

        System.out.println("Total de libros en la biblioteca: " + miBiblio1.obtenerCantidadLibros());

        System.out.println(" ");
        System.out.println("--- AUTORES DISPONIBLES ---");
        System.out.println(" ");

        miBiblio1.mostrarAutoresDisponibles();
   
    
    
    
    
    
    }
}


