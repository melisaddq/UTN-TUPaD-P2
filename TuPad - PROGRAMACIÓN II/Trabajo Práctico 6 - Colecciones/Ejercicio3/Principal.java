
package tp6.colecciones.casopractico3;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Universidad UTN = new Universidad("Universidad Tecnológica Nacional");

        //"--- CREO PROFESORES ---"

        Profesor p1 = new Profesor("P101", "Dra. Agustina Zanini", "");
        Profesor p2 = new Profesor("P102", "Ing. Yanet Orrego", "");
        Profesor p3 = new Profesor("P103", "Lic. Ester Sosa", "");


        //--- CREO LOS CURSOS ---

        Curso c1 = new Curso("C201", "Algoritmos y Estructuras de Datos");
        Curso c2 = new Curso("C202", "Programación Orientada a Objetos");
        Curso c3 = new Curso("C203", "Sistemas Operativos");
        Curso c4 = new Curso("C204", "Bases de Datos Avanzadas");
        Curso c5 = new Curso("C205", "Redes de Computadoras");
        
        System.out.println(" ");
        System.out.println("--- AGREGO PROFESORES A LA UNIVERSIDAD ---");

        UTN.agregarProfesor(p1);
        UTN.agregarProfesor(p2);
        UTN.agregarProfesor(p3);
        
        System.out.println(" ");
        System.out.println("--- AGREGO CURSOS A LA UNIVERSIDAD ---");
        
        UTN.agregarCurso(c1);
        UTN.agregarCurso(c2);
        UTN.agregarCurso(c3);
        UTN.agregarCurso(c4);
        UTN.agregarCurso(c5);
        
        System.out.println(" ");
        System.out.println("--- ASIGNO CURSOS A PROFESORES USANDO asignarProfesorACurso() ---");        
       
        
        UTN.asignarProfesorACurso("C201", "P103");
        UTN.asignarProfesorACurso("C202", "p103");
        UTN.asignarProfesorACurso("C203", "p101");
        UTN.asignarProfesorACurso("C204", "p102");
        UTN.asignarProfesorACurso("C205", "p101");
        
        System.out.println(" ");
        System.out.println("--- LISTO LOS PROFESORES CON SUS CURSOS ---");
        UTN.listarProfesores();
        System.out.println(" ");
        System.out.println("--- LISTO LOS CURSOS CON SU PROFESOR ---");
        UTN.listarCursos();
 
        System.out.println(" ");
        System.out.println("--- CAMBIO EL PROFESOR DE UN CURSO USANDO asignarProfesorACurso() Y VERIFICO ---");         
        UTN.asignarProfesorACurso("C201", "P102");
        System.out.println(" ");
        System.out.println("--- LISTO NUEVAMENTE LOS PROFESORES CON SUS CURSOS ---");
        UTN.listarProfesores();
        System.out.println(" ");
        System.out.println("--- LISTO LOS CURSOS CON SU PROFESOR ---");

        UTN.listarCursos();
        
        
        
        
        // Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println(" ");
        System.out.println("--- ELIMINAR CURSO C203 SISTEMAS OP. ---");        
        UTN.eliminarCurso("C203");
        System.out.println(" ");
        System.out.println("--- LISTO CURSOS DE LA DRA ZANINI ---"); 

        p1.listarCursos();
        
        // Remover un profesor y dejar profesor = null,
        System.out.println(" ");
        System.out.println("--- REMOVER PROFESOR DRA ZANINI, SETEAR EN NULL ---");         
         
        UTN.eliminarProfesor("P101");
        
        UTN.listarCursos();
        
        
        System.out.println(" ");
        System.out.println("--- REPORTE DE CANTIDAD DE CURSOS POR PROFESOR ---");        
        UTN.cantidadCursosPorProfesor();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
