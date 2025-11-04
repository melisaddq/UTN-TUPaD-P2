
package tp8.interfaces;


public class PayPal implements PagoConDescuento {
    private String mail;

    public PayPal(String mail) {
        this.mail = mail;
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.10;
        System.out.println("--Aplicando descuento de PayPal del cliente " + mail + " --");
        return monto - descuento;
}

    @Override
    public void procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("--Procesando pago con descuento de PayPal. Total a pagar: $" + montoFinal + " --");
        }

 
    
    



    

}
