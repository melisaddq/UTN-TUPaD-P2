
package tp8.interfaces;


public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(" --- Enviando notificación al cliente " + this.nombre + " a la casilla de correo: " + this.email + " ---- ");
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", email:" + email;
    }
    
    

}
