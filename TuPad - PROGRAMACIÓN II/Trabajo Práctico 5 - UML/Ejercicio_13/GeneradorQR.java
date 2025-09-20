
package Ejercicio_13;


public class GeneradorQR {
    //GeneradorQR->método: void generar(String valor, Usuario usuario)
    
    public CodigoQR generar(String valor, Usuario usuario) {
        return new CodigoQR(valor, usuario);
    }
    
    
    
}
