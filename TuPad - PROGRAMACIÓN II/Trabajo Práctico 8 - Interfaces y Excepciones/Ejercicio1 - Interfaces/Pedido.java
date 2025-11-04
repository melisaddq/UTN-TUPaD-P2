
package tp8.interfaces;

import java.util.ArrayList;


public class Pedido implements Pagable {
    private ArrayList<Producto> productos;
    private EstadoPedido estado;
    private Cliente destinatario;

    public Pedido(Cliente destinatario) {
        this.productos = new ArrayList<>();
        this.destinatario = destinatario;
        this.estado = EstadoPedido.PENDIENTE_DE_PAGO; // ESTADO INICIAL
    }

    public void agregarProducto (Producto p){
        this.productos.add(p);
    }
        
    @Override
    public double calcularTotal() { // CALCULA EL TOTAL
        System.out.println("--Calculando total pedido de " + this.destinatario + "--");
        double totalPedido = 0;
        for (Producto p: this.productos){
            totalPedido += p.calcularTotal();
        }
        System.out.println("--Total del pedido de " + this.destinatario + ": $" + totalPedido + " --");
        return totalPedido;
    }
    
    public EstadoPedido getEstado() {
        return this.estado;
    }
    
    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Cambiando estado del pedido a: " + this.estado);
        this.destinatario.notificar("El estado de su pedido se actualizó a: " + this.estado.toString());
    }

}
