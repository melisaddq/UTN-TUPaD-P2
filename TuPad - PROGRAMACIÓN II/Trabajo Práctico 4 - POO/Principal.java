
package tp4.poo;


public class Principal {


    public static void main(String[] args) {
               
/* Crear una clase de prueba con método main que:
Instancie varios objetos usando ambos constructores.
Aplique los métodos actualizarSalario() sobre distintos empleados.
Imprima la información de cada empleado con toString().*/

System.out.println("---MUESTRO EMPLEADOS---");
System.out.println("El total actual de empleados es: " + Empleado.mostrarTotalEmpleados());        
        
Empleado emp1 = new Empleado(1, "Juan", "FrontEnd", 1250000.20); 

Empleado emp2 = new Empleado(2, "Marina", "BackEnd", 1200000.35); 

System.out.println("---MUESTRO EMPLEADOS---");
System.out.println("El total actual de empleados es: " + Empleado.mostrarTotalEmpleados());

Empleado emp3 = new Empleado("Eugenia", "Ingeniera Devops"); 

Empleado emp4 = new Empleado("Laura", "Analista de datos");

System.out.println("---MUESTRO EMPLEADOS---");
System.out.println("El total actual de empleados es: " + Empleado.mostrarTotalEmpleados());


// MUESTRO SALARIOS ANTES DE ACTUALIZAR
System.out.println("---MUESTRO SALARIOS ANTES DE ACTUALIZAR---");

System.out.println("El salario actual de " + emp1.getNombre() + " es: $" + emp1.getSalario());
System.out.println("El salario actual de " + emp2.getNombre() + " es: $" + emp2.getSalario());
System.out.println("El salario actual de " + emp3.getNombre() + " es: $" + emp3.getSalario());
System.out.println("El salario actual de " + emp4.getNombre() + " es: $" + emp4.getSalario());


// ACTUALIZO SALARIOS
emp1.actualizarSalario(10.00); // PORCENTAJE
emp2.actualizarSalario(50000); // FIJO
emp3.actualizarSalario(15.00); // PORCENTAJE
emp4.actualizarSalario(150000); // FIJO


//SALARIOS ACTUALIZADOS
System.out.println("---INFO EMPLEADOS CON SALARIO ACTUALIZADO---muestro con toString---");
System.out.println(emp1);
System.out.println(emp2);
System.out.println(emp3);
System.out.println(emp4);


    
        
    }

}
