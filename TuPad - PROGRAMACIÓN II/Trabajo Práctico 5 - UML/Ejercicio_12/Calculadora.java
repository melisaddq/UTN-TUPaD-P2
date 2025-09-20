
package Ejercicio_12;


public class Calculadora {

// void calcular (Impuesto impuesto)
        public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            System.out.println("Calculando el impuesto...");
            System.out.println("Monto del impuesto: $" + impuesto.getMonto());
            System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        } else {
            System.out.println("No se puede calcular. El objeto Impuesto es nulo.");
        }
    }
}

