
package Ejercicio4;


public class TarjetaDeCredito {

    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // ASOCIACIÓN BIDIRECCIONAL
    private Banco banco; // AGREGACIÓN
    
    // CONSTRUCTOR
        public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    
    
    // MÉTODOS
        
    public void mostrarBanco(){
        System.out.println("Ésta tarjeta es del banco " + banco.getNombre()); 
    }    
        
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
               "numeroDeTarjeta='" + numero + '\'' +
               ", cliente=" + (cliente != null ? cliente.getNombre() : "N/A") +
               '}';
    }
}

    
 
