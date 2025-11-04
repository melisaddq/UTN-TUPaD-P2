
package tp8.interfaces;


public class TarjetaDeCredito implements Pago {
    private String tarjetaNum;

    public TarjetaDeCredito(String tarjetaNum) {
        this.tarjetaNum = tarjetaNum;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("--Procesando pago con tarjeta número: " + this.tarjetaNum + ". Total a pagar: $" + monto + " --"); 
    }
    
    
    
    
    
}
