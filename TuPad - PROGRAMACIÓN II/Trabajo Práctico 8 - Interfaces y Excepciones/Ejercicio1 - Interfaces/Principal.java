
package tp8.interfaces;


public class Principal {

    public static void main(String[] args) {
        
     

        Cliente cliente1 = new Cliente("Indiana Jones", "jones.in@hotmail.com");
        Pedido pedidoInd = new Pedido(cliente1);
        Producto laptop = new Producto("Laptop Pro", 1500.00);
        pedidoInd.agregarProducto(laptop);
        double total1 = pedidoInd.calcularTotal();
        PagoConDescuento pago1 = new PayPal("jones.in@hotmail.com");
        pago1.procesarPago(total1);
        pedidoInd.cambiarEstado(EstadoPedido.PAGADO);
        pedidoInd.cambiarEstado(EstadoPedido.ENVIADO);
        
        System.out.println("");
        System.out.println("******* NUEVO INGRESO PEDIDO *******");
        System.out.println("");
        
        Cliente cliente2 = new Cliente("Juan Vargas", "juan.v@gmail.com");
        Pedido pedidoJuan = new Pedido(cliente2);     
        Producto smartwatch = new Producto("Smartwatch", 300.00);
        pedidoJuan.agregarProducto(smartwatch);
        double total2 = pedidoJuan.calcularTotal();
        Pago pago2 = new TarjetaDeCredito("456789456");
        pago2.procesarPago(total2);
        pedidoJuan.cambiarEstado(EstadoPedido.PAGADO);
        pedidoJuan.cambiarEstado(EstadoPedido.EN_PREPARACION);
        pedidoJuan.cambiarEstado(EstadoPedido.CANCELADO);
    }




}
        
