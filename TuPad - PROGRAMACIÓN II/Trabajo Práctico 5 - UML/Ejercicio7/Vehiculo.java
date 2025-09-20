
package Ejercicio7;


public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;
    
// CONSTRUCTOR
public Vehiculo(String patente, String modelo, Motor motor) {
    this.patente = patente;
    this.modelo = modelo;
    this.motor = motor;
    }
    
// MÉTODOS

    public void mostrarMotor(){
        if (motor != null){
            System.out.println("El vehículo de patente " + patente + " tiene el motor " + motor.getTipo() + " con número de serie " + motor.getNumeroSerie());
        } else {
            System.out.println("El vehículo de patente " + patente + " no presenta motor.");
        }
        
    }
   
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this){
           conductor.setVehiculo (this);
        }
    }
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor.getTipo() +" número de serie: "+ motor.getNumeroSerie() + ", conductor=" + conductor.getNombre() + '}';
    }

    
    
    
    
}