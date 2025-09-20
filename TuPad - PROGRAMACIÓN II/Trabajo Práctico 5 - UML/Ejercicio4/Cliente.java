
package Ejercicio4;


public class Cliente {
    
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaDeCredito;
    

    // CONSTRUCTOR
    public Cliente(String nombre, String dni) {
    this.nombre = nombre;
    this.dni = dni;
    }
        
    // MÉTODOS

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this) {
            tarjetaDeCredito.setCliente(this);
        }
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
               "nombre='" + nombre + '\'' +
               ", tarjetaDeCredito=" + (tarjetaDeCredito != null ? tarjetaDeCredito.getNumero(): "N/A") +
               '}';
    }
}    

    

