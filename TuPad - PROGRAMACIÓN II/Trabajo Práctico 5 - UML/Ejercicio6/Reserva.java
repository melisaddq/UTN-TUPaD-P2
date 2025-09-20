
package Ejercicio6;


public class Reserva {
    private String fecha;
    private String hora;
    private Mesa mesa; // AGREGACIÓN
    private Cliente cliente; // ASOCIACIÓN UNID.
    
    
    // CONSTRUCTOR

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    
    // MÉTODOS 
    
    public void mostrarCliente(){
        if (cliente != null){
            System.out.println("El cliente es: " + cliente.getNombre());
        } else{
            System.out.println("No hay cliente asignado a esta reserva");
        }
    }
    
    public void mostrarMesa(){
        if (mesa != null){
            System.out.println("La mesa asignada para esta reserva es la número: " + mesa.getNumero());
        } else{
            System.out.println("No existe una mesa reservada");
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha: " + fecha + ", hora: " + hora + ", mesa: " + mesa.getNumero() + ", cliente: " + cliente.getNombre()+ '}';
    }
    
    

}
