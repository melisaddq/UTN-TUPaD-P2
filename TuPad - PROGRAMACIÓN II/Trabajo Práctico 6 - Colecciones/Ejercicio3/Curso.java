
package tp6.colecciones.casopractico3;


public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    // CONSTRUCTOR
    
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    
    // MÉTODOS

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    

    public Profesor getProfesor() {
        return profesor;
    }
    

    public void setProfesor(Profesor p) {

        Profesor profesorPrevio = this.profesor; 

        // SINCRONIZACIÓN DEL PROFESOR PREVIO 
        if (profesorPrevio != null && (p == null || !profesorPrevio.equals(p))) {

            profesorPrevio.getCursos().remove(this); 

            System.out.println("Desvinculado de " + profesorPrevio.getNombre() + " (Profesor anterior).");
        }

        // --- ASIGNACIÓN AL CURSO ---
        this.profesor = p;

        // --- SINCRONIZACIÓN DEL NUEVO PROFESOR (si no es null) ---
        if (p != null) {
            if (!p.getCursos().contains(this)) {
                p.agregarCurso(this); 
            }
        }
    }
    

    public void mostrarInfo() {
        System.out.println("\n--- INFORMACIÓN DEL CURSO ---\n");
        System.out.println("Código: " + codigo);
        System.out.println("nombre: " + nombre);
        System.out.println("Profesor que dicta el curso: " + profesor);
    }

    @Override
    public String toString() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "N/A";
        return "Curso {Código: " + codigo + ", Nombre: " + nombre + ", Profesor: " + nombreProfesor + "}";
    }

    

}
