
package Ejercicio_13;


public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario ("Nicolás", "nico456@jijiji.com.ar");
        GeneradorQR generadorQR = new GeneradorQR();
        
        
        
        CodigoQR codigo = generadorQR.generar("http://qrqr.com/qr/nico", usuario);
        
        System.out.println(codigo.toString());
        
            
        
        
        
    }

}
