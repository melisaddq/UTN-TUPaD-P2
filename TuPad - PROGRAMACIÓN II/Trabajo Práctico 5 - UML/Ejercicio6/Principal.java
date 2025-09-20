
package Ejercicio6;


public class Principal {
    public static void main(String[] args) {
        
        
    Mesa mesa1 = new Mesa ("1","4 personas");
    Mesa mesa2 = new Mesa ("2","2 personas");
    
    Cliente cliente1 = new Cliente ("Juan Pez","221 698 4561");
    Cliente cliente2 = new Cliente ("Martina Langostino","011 669 4567");
    
    Reserva reserva1 = new Reserva("26/09/2025","21:00",mesa1);
    Reserva reserva2 = new Reserva ("26/09/2025","20:30", mesa2);
    

    reserva1.setCliente(cliente1);
    reserva2.setCliente(cliente2);

    
    System.out.println(reserva1.toString());
    System.out.println(reserva2.toString());
        
    reserva1.mostrarMesa();
    reserva1.mostrarCliente();

    
    reserva2.mostrarMesa();
    reserva2.mostrarCliente();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
