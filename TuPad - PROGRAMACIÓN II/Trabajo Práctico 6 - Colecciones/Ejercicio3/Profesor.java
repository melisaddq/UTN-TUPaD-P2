
package tp6.colecciones.casopractico3;

import java.util.ArrayList;


public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;
    
    // CONSTRUCTOR

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    
    // MÉTODOS
    
    public void agregarCurso(Curso c){
        this.cursos.add(c);
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
    

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

       
    public void eliminarCurso(Curso c) {
        if (c == null) {
            System.out.println("El curso a eliminar no existe.");
            return;
        }
        // SINCRONIZACIÓN DEL LADO DEL PROFESOR
        boolean removidoDeLista = this.cursos.remove(c);

        if (removidoDeLista) {
            System.out.println("Curso " + c.getNombre() + " removido de la lista de cursos del Profesor " + this.nombre + ".");

        // SINCRONIZACIÓN DEL LADO DEL CURSO (Actualiza la referencia del curso)
        if (c.getProfesor() != null && c.getProfesor().equals(this)) {
            c.setProfesor(null); // Deja el profesor en null en el lado del Curso
            }
        } else {
            System.out.println("El curso " + c.getNombre() + " no estaba en la lista de cursos del Profesor " + this.nombre + ".");
        }
    }
    
    public void listarCursos(){
        if (cursos.isEmpty()) {
            System.out.println("La lista de cursos está vacía.");
            return;
        }
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    
    public void mostrarInfo() {
        System.out.println("\n--- INFORMACIÓN DEL PROFESOR ---\n");
        System.out.println("ID: " + id);
        System.out.println("Nombre completo: " + nombre);
        System.out.println("Cantidad de cursos que dicta: " + cursos.size());
    }

    @Override
    public String toString() {
    ArrayList<String> nombresCursos = new ArrayList<>();

    for (Curso curso : this.cursos) {
        nombresCursos.add(curso.getNombre());
    }

    return "Profesor { ID: " + id + ", Nombre: " + nombre + ", Cursos que dicta: " + nombresCursos + " }";
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
}
