
package Ejercicio9;


public class CitaMedica {
    private String fecha;
    private String hora;
    private Profesional profesional;
    private Paciente paciente;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    
    // MÉTODOS
    public void mostrarProfesional(){
        if(profesional != null){
            System.out.println("El profesional de especialidad" + profesional.getEspecialidad() + " es: " + profesional.getNombre());
        } else{
            System.out.println("Usted no tiene un profesional asignado.");
        }
    }
    
        public void mostrarPaciente(){
        if(paciente != null){
            System.out.println("El pacientepara la cita médica es: " + paciente.getNombre() + " y su obra social es: " + paciente.getObraSocial());
        } else{
            System.out.println("Esta cita médica no tiene un paciente registrado.");
        }
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Cita Medica{" + "fecha: " + fecha + ", hora: " + hora + ", profesional: " + profesional.getNombre() + ", especialidad: " + profesional.getEspecialidad() + ", paciente: " + paciente.getNombre() + '}';
    }
    
    
}
