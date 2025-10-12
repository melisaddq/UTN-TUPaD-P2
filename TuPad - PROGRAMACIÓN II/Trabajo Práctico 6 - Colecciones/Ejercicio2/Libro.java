
package tp6.colecciones.casopráctico2;


public class Libro {
    
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    
    // CONSTRUCTOR

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    
    
    // METODOS
    
    public void mostrarInfo() {
        System.out.println("\n--- INFORMACIÓN DEL LIBRO ---\n");
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("Autor: " + autor.getNombre() + " (" + autor.getNacionalidad() + ")");
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    
    @Override
    public String toString() {
        return "Libro " + "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + anioPublicacion + ", autor: " + autor + ".";
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}




