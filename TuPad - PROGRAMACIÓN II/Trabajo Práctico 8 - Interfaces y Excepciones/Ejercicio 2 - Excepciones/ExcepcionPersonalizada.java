
package tp8.excepciones;

/**
 *
 * @author meliddq
 */
public class ExcepcionPersonalizada {
    
    public static void validarEdad(int edad) throws IllegalArgumentException {
        if (edad < 0 || edad > 120) {
            // Lanza la excepción si la edad es inválida
            throw new IllegalArgumentException("La edad " + edad + " está fuera del rango etario");
        }
    }


    

    
}

