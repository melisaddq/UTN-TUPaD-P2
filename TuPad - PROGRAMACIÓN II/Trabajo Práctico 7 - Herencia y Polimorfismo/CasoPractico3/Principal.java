
package tp7.herenciaypolimorfismo.CasoPractico3;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
            ArrayList<Empleado> empleados = new ArrayList<>();        
            
            empleados.add(new EmpleadoPlanta(125.30, "Guido Carrillo"));
            empleados.add(new EmpleadoTemporal( 20, 500, "Paulo Díaz"));
            empleados.add(new EmpleadoPlanta( 152.33, "Eduardo Dominguez"));
            empleados.add(new EmpleadoTemporal( 25, 510, "Marcelo Gallardo"));

               System.out.println("---- CÁLCULO DE SUELDOS ----");  

            for (Empleado emp : empleados) {

            if (emp instanceof EmpleadoPlanta) {
                System.out.println("El sueldo del empleado " + emp.getNombre() + " trabajador en planta, es: " + emp.calcularSueldo());
                System.out.println("--------"); 

            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("El sueldo del empleado " + emp.getNombre() + " trabajador temporal, es: " + emp.calcularSueldo());
                System.out.println("--------"); 
            }
        }
    }

}
