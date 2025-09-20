
package Ejercicio7;


public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;
    
// CONSTRUCTOR    

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
// MÉTODOS

public void setVehiculo(Vehiculo vehiculo){
    this.vehiculo = vehiculo;
    if (vehiculo != null && vehiculo.getConductor() != this){
        vehiculo.setConductor(this);
    }
}    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    


}
