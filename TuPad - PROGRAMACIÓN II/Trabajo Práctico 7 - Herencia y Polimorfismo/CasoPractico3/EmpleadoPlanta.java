
package tp7.herenciaypolimorfismo.CasoPractico3;


public class EmpleadoPlanta extends Empleado {
    private double sueldoFijo;

    public EmpleadoPlanta(double sueldoFijo, String nombre) {
        super(nombre);
        this.sueldoFijo = sueldoFijo;
    }
    
    @Override
    public double calcularSueldo(){
        return sueldoFijo * 0.03 + sueldoFijo; // Suponiendo un aumento del 3% para el mes en cuestión
    }
    
    
    
    

}
