
package Ejercicio9;


public class Principal {
    public static void main(String[] args) {
        
        Profesional belen = new Profesional("Belén Santotomé","Ginecóloga");
        
        Paciente paciente1 = new Paciente("Gisella Gómez","Swiss tetrical");
        
        CitaMedica citaMedica = new CitaMedica("30/09/2025","16:30");
        
        citaMedica.setPaciente(paciente1);
        citaMedica.setProfesional(belen);
        
        System.out.println(citaMedica.toString());
        
        
        
    }

}
