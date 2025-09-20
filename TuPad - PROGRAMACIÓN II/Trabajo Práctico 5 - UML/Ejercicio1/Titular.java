
package Ejercicio1;


public class Titular {
// ATRIBUTOS
    private String nombre;
    private String DNI;
    private Pasaporte pasaporte; // RELACION BIDIRECCIONAL
// CONSTRUCTOR
    public Titular(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
// METODOS
    
    public void mostrarPasaporte(){
        if (pasaporte != null){
            System.out.println(nombre + " tiene pasaporte con número: " + pasaporte.getNumero());
        } else{
            System.out.println(nombre + " no tiene pasaporte.");
        }
    }
    
        public void setPasaporte (Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
        }
    }
    
// GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    // toString

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", DNI=" + DNI + ", pasaporte=" + pasaporte + '}';
    }
    
    
    
    
}
