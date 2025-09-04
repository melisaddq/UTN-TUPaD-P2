
package tp4.poo;


public class Empleado {
    
// ATRIBUTOS
    private int id; // Identificador único del empleado.
    private String nombre; // Nombre completo.
    private String puesto; // Cargo que desempeña.
    private double salario; // Salario actual.
    private static int totalEmpleados = 0; // Contador global de empleados creados.
    
    

// CONSTRUCTORES SOBRECARGADOS
    
    // Uno que reciba todos los atributos como parámetros.
    // Ambos deben incrementar totalEmpleados.
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados ++;
    }
    // Otro que reciba solo nombre y puesto, asignando un id automático y un salario por defecto.
    
    public Empleado (String nombre, String puesto) {
        this.id = ++ totalEmpleados; // genera un id automatico a medida que se suman empleados
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1500000; // SALARIO POR DEFECTO
    }
  
    
    // MÉTODOS SOBRECARGADOS
    // Métodos sobrecargados actualizarSalario:
    // Uno que reciba un porcentaje de aumento.
    // Otro que reciba una cantidad fija a aumentar.
    
    public void actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento <= 0 || porcentajeAumento > 100){ // VALIDACIÓN
            System.out.println("El porcentaje de aumento no puede ser menor o igual a cero ni mayor a 100.");
        }
        this.salario += this.salario * (porcentajeAumento / 100);
    }


    public void actualizarSalario(int montoAumento){
        if (montoAumento <= 0){    // VALIDACIÓN
            System.out.println("El monto de aumento no puede ser menor o igual a cero.");
        }
        this.salario += montoAumento;
    }

    // Método toString():
    // Mostrar id, nombre, puesto y salario de forma legible.

    @Override
    public String toString() {
        return "Empleado { " + "Id: " + id + ", nombre: " + nombre + ", puesto: " + puesto + ", salario: " + salario + '}';
    }


    
    // Método estático mostrarTotalEmpleados():
    // Retornar el total de empleados creados hasta el momento. 
    
    static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
           
    
    //SETTERS

    public void setNombre(String nombre) {
        if (nombre != null) {
        this.nombre = nombre;
        }
    }

    public void setPuesto(String puesto) {
        if (puesto != null) {
        this.puesto = puesto;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(double salario) {
        if (salario <= 0 ){
            System.out.println("El salario no puede ser menor o igual a 0.");
        }
        this.salario = salario;
    }
    
    

    //GETTERS

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
    
    
}
