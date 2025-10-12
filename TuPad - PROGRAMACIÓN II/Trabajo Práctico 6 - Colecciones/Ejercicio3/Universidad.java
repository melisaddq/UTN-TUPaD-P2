
package tp6.colecciones.casopractico3;

import java.util.ArrayList;


public class Universidad {
    
    private String nombre;
    private ArrayList<Curso> cursos;
    private ArrayList<Profesor> profesores;
    
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p) {
        if (buscarProfesorPorId(p.getId()) != null) {
            System.out.println("El profesor con ID " + p.getId() + " ya existe.");
            return;
        }
        profesores.add(p);
        System.out.println("Profesor " + p.getNombre() + " agregado a " + this.nombre + ".");
    }

    public void agregarCurso(Curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) != null) {
            System.out.println("El curso con código " + c.getCodigo() + " ya existe.");
            return;
        }
        cursos.add(c);
        System.out.println("Curso " + c.getNombre() + " agregado a " + this.nombre + ".");
    }
    

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("Curso con código " + codigoCurso + " no encontrado.");
            return;
        }
        if (profesor == null) {
            System.out.println("Profesor con ID " + idProfesor + " no encontrado.");
            return;
        }

        curso.setProfesor(profesor);
        System.out.println("\nProfesor " + profesor.getNombre() + " asignado al curso " + curso.getNombre() + ".\n");
    }
    
    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        System.out.println("\n--- PROFESORES EN " + this.nombre + " ---");
        for (Profesor p : profesores) {
            System.out.println(p); 
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }
        System.out.println("\n--- CURSOS EN " + this.nombre + " ---");
        for (Curso c : cursos) {
            System.out.println(c); 
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }
    
    public void eliminarCurso(String codigo) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigo);

        if (cursoAEliminar == null) {
            System.out.println("Curso con código " + codigo + " no encontrado para eliminar.");
            return;
        }

        // Rompo la relación bidireccional (sincronizo el lado del profesor)
        Profesor profesorActual = cursoAEliminar.getProfesor();

        if (profesorActual != null) {
            cursoAEliminar.setProfesor(null); 
        }

        // Elimino el curso de la Universidad
        cursos.remove(cursoAEliminar);
        System.out.println("Curso " + cursoAEliminar.getNombre() + " eliminado de la Universidad.");
    }

    public void eliminarProfesor(String id) {
        Profesor profesorAEliminar = buscarProfesorPorId(id);

        if (profesorAEliminar == null) {
            System.out.println("Profesor con ID " + id + " no encontrado para eliminar.");
            return;
        }

        // Rompo la relación bidireccional: Dejo en null los cursos que dictaba.
        ArrayList<Curso> cursosDictados = new ArrayList<>(profesorAEliminar.getCursos()); 

        System.out.println("Desvinculando " + cursosDictados.size() + " cursos del Profesor " + profesorAEliminar.getNombre() + "...");

        for (Curso curso : cursosDictados) {
            curso.setProfesor(null); 
        }

        // Elimino el profesor de la Universidad
        profesores.remove(profesorAEliminar);
        System.out.println("Profesor " + profesorAEliminar.getNombre() + " eliminado de la Universidad.");
    }
    
    public void cantidadCursosPorProfesor() {
        if (this.profesores.isEmpty()) {
            System.out.println("No hay profesores registrados para generar el reporte.");
            return;
        }

        System.out.println("\n--- CANTIDAD DE CURSOS POR PROFESOR ---");
        
        for (Profesor profesor : this.profesores) {
            ArrayList<Curso> cursosDictados = profesor.getCursos();
            int cantidadCursos = cursosDictados.size();
            

            System.out.println(profesor.getNombre()+": " + cantidadCursos );
        }
    }
}
    
    
