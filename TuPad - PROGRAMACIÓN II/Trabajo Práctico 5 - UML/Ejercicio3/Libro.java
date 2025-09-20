
package Ejercicio3;


public class Libro {
    private String titulo;
    private final String isbn;
    private Editorial editorial; // agregación
    private Autor autor; // asociación unidireccional
    
    // CONSTRUCTOR

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    
    // MÉTODOS
    
    public void mostrarEditorial(){
        if (editorial != null){
            System.out.println("La editorial del libro" + titulo + " es: " + editorial.getNombre());
        } else {
            System.out.println("El libro" + titulo + " no presenta editorial");
        }
        
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    

    public void mostrarAutor() {
        if (autor != null){
            System.out.println("El autor de " + titulo + " " + isbn + "es: " + autor.getNombre());
        } else{
            System.out.println("El libro " + titulo + " no tiene el autor seteado.");
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo = " + titulo + ", isbn = " + isbn + ", editorial = " + editorial.getNombre() + ", autor = " + autor.getNombre() + ", nacionalidad = " + autor.getNacionalidad() + '}';
    }

        


    
}
