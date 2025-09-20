
package Ejercicio_12;


public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
   
    public void mostrarContribuyente(){
        if (contribuyente != null){
            System.out.println("El contribuyente es:" + contribuyente.getNombre() + ", cuil:" + contribuyente.getCuil());
        }
    }

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }
    
    
}
