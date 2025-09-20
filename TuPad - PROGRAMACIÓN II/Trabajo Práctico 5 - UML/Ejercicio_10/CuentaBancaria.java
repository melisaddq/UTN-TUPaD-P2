
package Ejercicio_10;


public class CuentaBancaria {
    private String cbu;
    private String saldo;
    private ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, String saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad (codigo, ultimaModificacion);
    }
    
    // MÉTODOS
    
    public void setTitular(Titular titular){
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this){
            titular.setCuentaBancaria (this);
        }
    }

    public String getCbu() {
        return cbu;
    }

    public String getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }
    
    
    
    
    
    

}
