
package Ejercicio2;


public class Bateria {
    
    private String modelo;
    private String capacidad;
    
// CONSTRUCTOR
    
    public Bateria(String modelo, String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
// MÉTODOS
    
// GETTERS
    public String getModelo() {
        return modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }
    
// SETTERS

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    

}
