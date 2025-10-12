
package tp6.colecciones.casopráctico2;


public class Autor {
    
    private String id;
    private String nombre;
    private String nacionalidad;
    
    // CONSTRUCTOR

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
       
    // METODOS
    
    public void mostrarInfo() {
        System.out.println("--- INFORMACIÓN DEL AUTOR ---");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor: " + "ID:" + id + ", nombre: " + nombre + ", nacionalidad: " + nacionalidad + '.';
    }
    
    
    

}
