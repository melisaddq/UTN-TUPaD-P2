
package tp7.herenciaypolimorfismo.CasoPractico3;


public class EmpleadoTemporal extends Empleado {
    private int cantHoras;
    private double valorHora;

    public EmpleadoTemporal(int cantHoras, double valorHora, String nombre) {
        super(nombre);
        this.cantHoras = cantHoras;
        this.valorHora = valorHora;
    }
    
    
    @Override
    public double calcularSueldo(){
        return cantHoras * valorHora;
    }
    
    
    
}
