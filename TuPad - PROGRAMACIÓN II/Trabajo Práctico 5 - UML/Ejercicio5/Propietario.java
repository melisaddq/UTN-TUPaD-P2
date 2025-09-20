
package Ejercicio5;


public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;
    
/// CONSTRUCTOR
    public Propietario (String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
  
    // MÉTODOS
    
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this){
            computadora.setPropietario(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    @Override
    public String toString() {
        return "Propietario{" + "Nombre: " + nombre + ", DNI: " + dni + ", Computadora con número de serie: " + computadora.getNumeroSerie() + " marca: " + computadora.getMarca() + '}';
    }


    
    
    
    
}
